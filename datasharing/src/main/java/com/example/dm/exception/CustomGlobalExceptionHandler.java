package com.example.dm.exception;

/*import com.gjj.api.enumT.ErrorCodeEnum;
import com.gjj.api.service.LogServiceImpl;*/
import com.example.dm.enumT.ErrorCodeEnum;
import com.example.dm.service.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Autowired
    private LogServiceImpl logService;



    @ExceptionHandler({ AccessDeniedException.class })
    public ResponseEntity<Object> handleAccessDeniedException(


            Exception ex, WebRequest request) {

        System.out.println("--------捕捉到二了  handleAccessDeniedException 异常啊啊 --------");



        ApiError apiError = new ApiError(
                HttpStatus.FORBIDDEN, ex.getMessage(), "");
        return new ResponseEntity<Object>(
                apiError, new HttpHeaders(), apiError.getStatus());

    }


    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(
            MissingServletRequestParameterException ex, HttpHeaders headers,
            HttpStatus status, WebRequest request) {
        String error = ex.getParameterName() + " parameter is missing";

        ApiError apiError =
                new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
        return new ResponseEntity<Object>(
                apiError, new HttpHeaders(), apiError.getStatus());


    }
    // Let Spring BasicErrorController handle the exception, we just override the status code
/*    @ExceptionHandler(BookNotFoundException.class)
    public void springHandleNotFound(HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.NOT_FOUND.value());

    }*/
/*    @ExceptionHandler(BookNotFoundException.class)
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String error = "Malformed JSON request";
        System.out.println("---------------------------------------------"+error);
        return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, error, ex));
    }
    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<Object>(apiError, apiError.getStatus());
    }*/


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {

        System.out.println("--------捕捉到二了  handleMethodArgumentNotValid 异常啊啊 --------");

        BindingResult result = ex.getBindingResult();
        List<Map> fieldErrors = result.getFieldErrors().stream()
                .map(f -> Map.of("objectName",f.getObjectName(), "field",f.getField(),"code", f.getCode()))
                .collect(Collectors.toList());
        ApiError apiError = new ApiError(
                HttpStatus.BAD_REQUEST, "fieldErrors:" + fieldErrors, "");
        return new ResponseEntity<Object>(
                apiError, new HttpHeaders(), apiError.getStatus());


     //   return handleExceptionInternal(ex, "Method argument not valid, fieldErrors:" + fieldErrors ,new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    /*
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {

        System.out.println("--------捕捉到二了  handleMethodArgumentNotValid 异常啊啊 --------");

        ex.printStackTrace();

            ApiError apiError = new ApiError(
                    HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), ex.getMessage());
            return new ResponseEntity<Object>(
                    apiError, new HttpHeaders(), apiError.getStatus());



    }*/
    @ExceptionHandler({ MyBusinessException.class })
    public ResponseEntity<Object> handleAll(MyBusinessException ex, WebRequest request) {
        System.out.println("---------------------------------------------");

        ex.printStackTrace();
        logService.endReqError(ex.getReqId(),ex.getMessage());
        MyBusinessException myBusinessException = (MyBusinessException)ex;
        if(myBusinessException.getCode().equals(ErrorCodeEnum.查询为空)){
            ApiError apiError = new ApiError(
                    HttpStatus.NOT_FOUND, ex.getLocalizedMessage(), "error occurred");
            return new ResponseEntity<Object>(
                    apiError, new HttpHeaders(), apiError.getStatus());
        }
        ApiError apiError = new ApiError(
                HttpStatus.INTERNAL_SERVER_ERROR, ex.getLocalizedMessage(), "error occurred");
        return new ResponseEntity<Object>(
                apiError, new HttpHeaders(), apiError.getStatus());
    }

    @ExceptionHandler({ Exception.class })
    public ResponseEntity<Object> handleAll(Exception ex, WebRequest request) {
        System.out.println("---------------------------------------------");

        ex.printStackTrace();
        MyBusinessException myBusinessException = (MyBusinessException)ex;
        if(myBusinessException.getCode().equals(ErrorCodeEnum.查询为空)){
            ApiError apiError = new ApiError(
                    HttpStatus.NOT_FOUND, ex.getLocalizedMessage(), "error occurred");
            return new ResponseEntity<Object>(
                    apiError, new HttpHeaders(), apiError.getStatus());
        }
        ApiError apiError = new ApiError(
                HttpStatus.INTERNAL_SERVER_ERROR, ex.getLocalizedMessage(), "error occurred");
        return new ResponseEntity<Object>(
                apiError, new HttpHeaders(), apiError.getStatus());
    }

    //...
}