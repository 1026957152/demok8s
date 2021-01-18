package com.example.dm.apidata;

import com.example.dm.domain_flow.AuthenticationInformation;
import com.example.dm.exception.ApiError;
import com.example.dm.repository_flow.AuthenticationInformationRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.gjj.api.domain_flow.AuthenticationInformation;
//import com.gjj.api.exception.ApiError;
//import com.gjj.api.repository_flow.AuthenticationInformationRepository;
import io.github.bucket4j.*;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class PerClientRateLimitInterceptor implements HandlerInterceptor {

  private final Map<String, Bucket> buckets = new ConcurrentHashMap<>();
  private static Map<String, Tuple2<AuthenticationInformation, Bucket>> buckets_map = new HashMap<>();
  private final Bucket freeBucket = Bucket4j.builder()
      .addLimit(Bandwidth.classic(10, Refill.intervally(10, Duration.ofMinutes(1))))
      .build();



  public static void refresh(AuthenticationInformationRepository authenticationInformationRepository) {
    List<AuthenticationInformation> informationList = authenticationInformationRepository.findAll();

    buckets_map = informationList.stream().collect(Collectors.toMap(e->e.getAccessKey(), e->{
      return Tuple.of(e,Bucket4j.builder()
              .addLimit(Bandwidth.classic(e.getRateLimit(), Refill.intervally(e.getRateLimit(), Duration.ofMinutes(1))))
              .build());
    }));


  }

  public PerClientRateLimitInterceptor(Map<String, Tuple2<AuthenticationInformation, Bucket>> map) {

    buckets_map = map;
  }

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler) throws Exception {


    Bucket requestBucket;




    String apiKey = request.getHeader("X-api-key");
    if (apiKey != null && !apiKey.isBlank()) {




      if(buckets_map.get(apiKey) != null){
        System.out.println("========找到APP限速====== {}");
        requestBucket = buckets_map.get(apiKey)._2;
      }else{
        requestBucket = this.freeBucket;

      }

    /*    if(authenticationInformation.getClientId().equals("user1")) {

          System.out.println("========找到CCB=============== {}"+authenticationInformation.getClientId());

          requestBucket = this.buckets.computeIfAbsent(apiKey, key -> premiumBucket());
        }else {
          System.out.println("========找到其他=============== {}"+authenticationInformation.getClientId());

          requestBucket = this.buckets.computeIfAbsent(apiKey, key -> standardBucket());
        }
*/

    }
    else {
      requestBucket = this.freeBucket;
    }




    ConsumptionProbe probe = requestBucket.tryConsumeAndReturnRemaining(1);
    if (probe.isConsumed()) {
      response.addHeader("X-Rate-Limit-Remaining",
          Long.toString(probe.getRemainingTokens()));
      return true;
    }

   response.setStatus(HttpStatus.TOO_MANY_REQUESTS.value()); // 429
    response.addHeader("X-Rate-Limit-Retry-After-Milliseconds",
        Long.toString(TimeUnit.NANOSECONDS.toMillis(probe.getNanosToWaitForRefill())));
    ApiError apiError = new ApiError(
            HttpStatus.TOO_MANY_REQUESTS, "ex.getLocalizedMessage()", "error occurred");
    ;
    String json = new ObjectMapper().writeValueAsString(apiError);

    response.getWriter().write(json);

/*
    populateResponse(new ResponseEntity<Object>(
            apiError, new HttpHeaders(), apiError.getStatus()),response);*/


    return false;
  }

  public static void populateResponse(ResponseEntity<Object> responseEntity, HttpServletResponse servletResponse)
          throws IOException {
    for (Map.Entry<String, List<String>> header : responseEntity.getHeaders().entrySet()) {
      String chave = header.getKey();
      for (String valor : header.getValue()) {
        servletResponse.addHeader(chave, valor);
      }
    }
    String json = new ObjectMapper().writeValueAsString(responseEntity.getBody());
    System.out.println("=========="+ json);
    servletResponse.setStatus(responseEntity.getStatusCodeValue());
    servletResponse.getWriter().write(json);
  }

  private static Bucket standardBucket() {
    return Bucket4j.builder()
        .addLimit(Bandwidth.classic(50, Refill.intervally(50, Duration.ofMinutes(1))))
        .build();
  }

  private static Bucket premiumBucket() {
    return Bucket4j.builder()
        .addLimit(Bandwidth.classic(100, Refill.intervally(100, Duration.ofMinutes(1))))
        .build();
  }

}