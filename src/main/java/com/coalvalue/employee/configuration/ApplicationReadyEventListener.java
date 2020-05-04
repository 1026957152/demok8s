
package com.coalvalue.employee.configuration;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Component
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent>, Ordered {
    private Logger logger = LoggerFactory.getLogger(ApplicationReadyEventListener.class);
    private ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

/*    @Value("${serviceUrl}")
    private String serviceUrl;


    @Value("${sendMessageUrl}")
    private String sendMessageUrl;*/

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {

        logger.debug("begin --------------------------------------------- register service, to master");

    //  consulService.registerService("serviceName","sericeId");

       executorService.execute(new Runnable() {
            @Override
            public void run() {

        /*       final HelloWorldServer server = new HelloWorldServer();
                try {
                    server.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    server.blockUntilShutdown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/

            }
        });

        logger.debug("end --------------------------------------------- register service, to master");

    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }


}
