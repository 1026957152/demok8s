package com.example.dm.config;


import com.example.dm.pojo.CCBExcel;
import com.example.dm.utils.ExcelPOIHelper;

import io.vavr.Tuple3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class CCBConfig {
    //过期时间1天
    private Duration timeToLive = Duration.ofSeconds(60);


    @Bean
    public Map<String, CCBExcel> ccbSHTYXYDMMap() throws IOException {

        //   File currDir = new File(".");
        //    String path = currDir.getAbsolutePath();
        //    fileLocation = path.substring(0, path.length() - 1) + FILE_NAME;
/*
        String filePath = ResourceUtils.getFile("classpath:榆林公积金.xlsx").getPath();
        ClassPathResource classPathResource = new ClassPathResource("static/something.txt");

        InputStream inputStream = classPathResource.getInputStream();
        File somethingFile = File.createTempFile("test", ".txt");
        try {
            FileUtils.copyInputStreamToFile(inputStream, somethingFile);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
*/

        ClassPathResource resource = new ClassPathResource("榆林公积金白名单升级核心数据（最终版）20200923.xlsx");
        InputStream inputStream = resource.getInputStream();
       // FileInputStream file = new FileInputStream(new File(fileLocation));

        // Resource resource = appContext.getResource("classpath:resources/榆林公积金.xls");
        ExcelPOIHelper excelPOIHelper;
        excelPOIHelper = new ExcelPOIHelper();
        Map<Integer, List<String>>  maps = excelPOIHelper.readExcel(inputStream);

        List<Tuple3<String,String,String>> tuple2s = maps.entrySet().stream().map(e->{
/*            System.out.println(e.getValue().get(2 + 13));
            System.out.println(e.getValue().get(2 + 4));
            System.out.println(e.getValue().get(2 +1));*/
            return new Tuple3<String,String,String>(e.getValue().get(2+13),

                    e.getValue().get(2 +1),  e.getValue().get(2 + 4));


        }).filter(e->e!= null).collect(Collectors.toList());
        // readExcel(tuple2s);


        return tuple2s.stream().collect(Collectors.toMap(e->e._1,e->new CCBExcel(e._1,e._2,e._3)));

    }


}