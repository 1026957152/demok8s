package com.coalvalue.employee.util;

//import net.coobird.thumbnailator.Thumbnails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by Peter Xu on 03/10/2015.
 */
public class FileUtil {

    private static final Logger logger = LoggerFactory.getLogger(FileUtil.class);
    public static final String RESOURCE_DIR = File.separator + "webapp" ;
    public static final String BASE_DIR = File.separator + "files" + File.separator;

    public static final String USER_IMAGE_DIR = BASE_DIR + "user_images" + File.separator;

    public static final String LOGO_IMAGE_DIR = BASE_DIR + "logo_images" + File.separator;

    public static final String COMPANY_FILE_DIR = BASE_DIR + "company_files" + File.separator;

    public static final String COMPANY_SCAN_QRCODE_FILE_DIR = BASE_DIR + "company_qrcode_files" + File.separator;

    //public static final String COMPANY_SCAN_QRCODE_FILE_DIR = BASE_DIR + "company_qrcode_files";


    public static final String HOMEPAGE_IMAGE_DIR = BASE_DIR + "homepage_images" + File.separator;
    /**
     * Set through WebAppRootListener
     * @return jetty.home/webapps/ROOT/(CoalValue)
     */
    public static String getCoalValueRootDir() {


        return System.getProperty((WebUtils.DEFAULT_WEB_APP_ROOT_KEY));
    }

    /**
     * @return jetty.home/webapps
     */
    public static String getWebAppDir() {
        String basePath = getCoalValueRootDir();
        System.out.println("path tracking ---------------- " + basePath);

        if (basePath.lastIndexOf(File.separator) == basePath.length() - 1) {
            basePath = basePath.substring(0,basePath.length()-1);
        }
        System.out.println("return basePath ---------------- " + basePath);
       String returnString = basePath;// basePath.substring(0, basePath.lastIndexOf(File.separator));


        System.out.println(" returnString 是 base 的 父目录 return basePath.substring(0, basePath.lastIndexOf(File.separator)); ---------------- " + returnString);
        return returnString;
    }

    /**
     * @param fileName xxx.jpg
     * @return .jpg
     */
    public static String getFileExt(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."), fileName.length());
    }

    public static String saveFile(String relativePath, MultipartFile file) {
        String fileStored = null;
        if (!file.isEmpty()) {
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            String fileExt = getFileExt(file.getOriginalFilename());
            StringBuffer uniqueFileName = new StringBuffer();
            uniqueFileName.append(uuid)
                          .append(fileExt);

            StringBuffer fileFullPath = new StringBuffer();
            fileFullPath.append(getWebAppDir())
                        .append(relativePath)
                        .append(uniqueFileName);
            logger.debug(" file full path is:{}",fileFullPath.toString());

            try {
                FileCopyUtils.copy(file.getBytes(), new File(fileFullPath.toString()));
                fileStored = relativePath.replace(File.separator, "/") + uniqueFileName;
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }
        return fileStored;
    }
    public static String saveFileWebappRoot(String relativePath, MultipartFile file) {
        String fileStored = null;
        if (!file.isEmpty()) {
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            String fileExt = getFileExt(file.getOriginalFilename());
            StringBuffer uniqueFileName = new StringBuffer();
            uniqueFileName.append(uuid)
                    .append(fileExt);

            StringBuffer fileFullPath = new StringBuffer();
            fileFullPath.append(getWebAppDir())
                    .append(relativePath)
                    .append(uniqueFileName);

            try {
                FileCopyUtils.copy(file.getBytes(), new File(fileFullPath.toString()));
                fileStored = relativePath.replace(File.separator, "/") + uniqueFileName;
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }
        return fileStored;
    }


    public static String saveThumbImage(String relativePath, BufferedImage imBuff,int width, int height ) {
        String fileStored = null;
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            String fileExt = ".jpg";//getFileExt(file.getOriginalFilename());
            StringBuffer uniqueFileName = new StringBuffer();
            uniqueFileName.append(uuid)
                    .append(fileExt);

            StringBuffer fileFullPath = new StringBuffer();
            fileFullPath.append(getWebAppDir())
                    .append(relativePath)
                    .append(uniqueFileName);

             logger.debug("thumbImage file parth is :{}", fileFullPath.toString() );
/*            try {
                if(imBuff != null) {
                    Thumbnails.of(imBuff).size(width,height).toFile(new File(fileFullPath.toString()));

                }
                fileStored = relativePath.replace(File.separator, "/") + uniqueFileName;
            } catch (IOException e) {
                logger.error(e.getMessage());
            }*/

        return fileStored;
    }


}
