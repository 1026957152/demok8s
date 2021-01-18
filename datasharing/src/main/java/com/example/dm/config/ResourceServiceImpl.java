package com.example.dm.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Created by silence yuan on 2015/7/25.
 */

@Service("ResourceServiceImpl")
public class ResourceServiceImpl {


    @Autowired
    ResourceLoader resourceLoader;


    //

    /*public void S_83_SEQ_住房公积金使用率_AND_0301020501__() {
        Arrays.stream(E_银行编码_HX.values()).forEach(e->{
            Resource resource = resourceLoader.getResource("classpath:banklogo/"+e.getLogoPath());

            try {
                InputStream input = resource.getInputStream();
                byte[] bytes = IOUtils.toByteArray(input);

                String encoded = Base64.getEncoder().encodeToString(bytes);

          //      System.out.println(encoded+"---------------");
             //   File file = resource.getFile();
            } catch (IOException ee) {
                ee.printStackTrace();
            }
        });



    }*/


}
