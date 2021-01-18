package com.example.dm.service;

/*import com.gjj.api.domain_flow.QuickLog;
import com.gjj.api.exception.MyBusinessException;
import com.gjj.api.repository_flow.QuickLogRepository;
import com.gjj.api.util.SnowFlake;*/
import com.example.dm.domain_flow.QuickLog;
import com.example.dm.exception.MyBusinessException;
import com.example.dm.repository_flow.QuickLogRepository;
import com.example.dm.util.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by silence yuan on 2015/7/25.
 */

@Service
public class LogServiceImpl {


    @Autowired
    private QuickLogRepository quickLogRepository;




    @Transactional
    public Long beginReq(String[] split, HttpServletRequest request, String cm002) throws MyBusinessException {


        QuickLog quickLog = new QuickLog();
        quickLog.setAccessKey(split[1]);
        quickLog.setClientId(Arrays.stream(split).collect(Collectors.joining()));
        quickLog.setReqContent(cm002);
        quickLog.setRequestURI(request.getRequestURI());
        quickLog.setRemoteAddr(request.getRemoteAddr());

        quickLog.setStatus("Pending");
        quickLog.setBeginDateTime(LocalDateTime.now());
        quickLog.setIdLong(SnowFlake.nextIdLong());

        return quickLogRepository.save(quickLog).getIdLong();

    }



    @Transactional
    public String endReq(Long no, String toJSONString) {

        Optional<QuickLog> quickLog = quickLogRepository.findByIdLong(no);

        if(quickLog.isPresent()){
            QuickLog quickLog1 = quickLog.get();
            quickLog1.setContent(toJSONString);
            quickLog1.setStatus("Success");
            quickLog1.setEndDateTime(LocalDateTime.now());
            java.time.Duration duration = java.time.Duration.between(quickLog1.getBeginDateTime(),  quickLog1.getEndDateTime() );

            quickLog1.setDuration(duration.toSeconds());
            return quickLogRepository.save(quickLog1).getNo();
        }else{
            return null;
        }

    }
    @Transactional
    public void endReqError(Long reqId, String message) {
        Optional<QuickLog> quickLog = quickLogRepository.findByIdLong(reqId);

        if(quickLog.isPresent()){
            QuickLog quickLog1 = quickLog.get();
            quickLog1.setErrorContent(message);
            quickLog1.setStatus("Failed");
            quickLog1.setEndDateTime(LocalDateTime.now());
            java.time.Duration duration = java.time.Duration.between(quickLog1.getBeginDateTime(),  quickLog1.getEndDateTime() );

            quickLog1.setDuration(duration.toSeconds());
             quickLogRepository.save(quickLog1).getNo();
        }
    }
}
