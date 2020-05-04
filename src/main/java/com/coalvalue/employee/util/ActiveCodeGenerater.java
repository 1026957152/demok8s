package com.coalvalue.employee.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by zohu on 1/6/2015.
 */
public class ActiveCodeGenerater {

    //encrypt method key
    public static final String SHA1_KEY = "SHA-1";
    public static final String MD5_KEY = "MD5";

    //mail format
    public static final String mail_format =
            "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";


    public static String bytesToHexString(byte[] srcBytes){

        StringBuilder stringBuilder = new StringBuilder("");

        if (srcBytes == null || srcBytes.length <= 0) {
            return null;
        }
        for (int i = 0; i < srcBytes.length; i++) {
            int v = srcBytes[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }


    public static byte[] encryptingBytes(String srcStr,String encryptKey) {

        byte[] result = null;

        try {
            MessageDigest md = MessageDigest.getInstance(encryptKey);
            md.reset();
            md.update(srcStr.getBytes("UTF-8"));
            result = md.digest();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return result;
    }



    public static String encodingSrcString(String mailAddr)//,String otherStr)
    {

        if(!mailAddr.equals("") && mailAddr != null){
                //&&(!otherStr.equals("") && otherStr != null)) {

            if(Pattern.compile(mail_format).matcher(mailAddr).matches() != false || true) {

                SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date curDateTime = new Date();

                //step1.简单地进行字符串分割，并排序
                String[] arry = {mailAddr.split("@")[0], mailAddr.split("@")[1], df.format(curDateTime)};
                Arrays.sort(arry);
                String tempStr = arry[0] + arry[1] + arry[2];

                //step2.
                byte[] tempBytes = encryptingBytes(tempStr, SHA1_KEY);

                //step3.
                String resActiveCode = bytesToHexString(tempBytes);

                return resActiveCode;
            }
            else
                return "";
        }
        else
            return "";

    }








    /**
     * 创建指定数量的随机字符串
     * @param numberFlag 是否是数字
     * @param length
     * @return
     */
    public static String createSMSActiveCode(boolean numberFlag, int length){
        String retStr = "";
        String strTable = numberFlag ? "1234567890" : "1234567890abcdefghijkmnpqrstuvwxyz";
        int len = strTable.length();
        boolean bDone = true;
        do {
            retStr = "";
            int count = 0;
            for (int i = 0; i < length; i++) {
                double dblR = Math.random() * len;
                int intR = (int) Math.floor(dblR);
                char c = strTable.charAt(intR);
                if (('0' <= c) && (c <= '9')) {
                    count++;
                }
                retStr += strTable.charAt(intR);
            }
            if (count >= 2) {
                bDone = false;
            }
        } while (bDone);

        return retStr;
    }

}
