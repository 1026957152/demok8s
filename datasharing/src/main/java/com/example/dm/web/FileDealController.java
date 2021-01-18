package com.example.dm.web;


//import com.gjj.api.util.FileUtil;
import com.example.dm.util.FileUtil;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.activation.MimetypesFileTypeMap;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

@RequestMapping("/file")
@RestController
public class FileDealController {

    @RequestMapping(value = "download")
    public ResponseEntity<Void> download(
            @RequestParam("fileName") String filename
    ) throws IOException {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();



        HttpServletResponse response = requestAttributes.getResponse();

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

            Arrays.stream(resolver.getResources("classpath*:validator-rule/*identify-normal-rule.xml")).forEach(res-> {
                System.out.println("=================================" + res.getFilename());

            });




        // 设置信息给客户端不解析
        String type = new MimetypesFileTypeMap().getContentType(filename);
        // 设置contenttype，即告诉客户端所发送的数据属于什么类型
        response.setHeader("Content-type",type);
        // 设置编码
        String hehe = new String(filename.getBytes("utf-8"), "iso-8859-1");
        // 设置扩展头，当Content-Type 的类型为要下载的类型时 , 这个信息头会告诉浏览器这个文件的名字和类型。
        response.setHeader("Content-Disposition", "attachment;filename=" + hehe);
        FileUtil.download(filename, response);
        return ResponseEntity.status(HttpStatus.OK).build();

    }


    @RequestMapping(path = "/download_ca", method = RequestMethod.GET)
    public ResponseEntity<Resource> download_ca(String param)  {

        // ...

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();


        try{
            File file = resolver.getResources("classpath*:mycer_prod.cer")[0].getFile();

            HttpHeaders headers = new HttpHeaders();
            headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
            headers.add("Pragma", "no-cache");
            headers.add("Expires", "0");
            headers.add("Content-Disposition", "attachment;filename=" + file.getName());
            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

            return ResponseEntity.ok()
                    .headers(headers)
                    .contentLength(file.length())
                    .contentType(MediaType.parseMediaType("application/octet-stream"))
                    .body(resource);
        }catch (IOException io){
            io.printStackTrace();;
            return null;
        }



    }
}
