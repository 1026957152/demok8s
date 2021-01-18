package com.example.dm.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 身份证合法性校验
 * </p>
 * 
 * <pre>
 * --15位身份证号码：第7、8位为出生年份(两位数)，第9、10位为出生月份，第11、12位代表出生日期，第15位代表性别，奇数为男，偶数为女。
 * --18位身份证号码：第7、8、9、10位为出生年份(四位数)，第11、第12位为出生月份，第13、14位代表出生日期，第17位代表性别，奇数为男，偶数为女。
 *    最后一位为校验位
 * </pre>
 * 
 * @author 313921
 */
public class IdCardUtil {
    
    private static Logger logger = LoggerFactory.getLogger(IdCardUtil.class);

/*    public void main(String[] args){
        int N = 1024;//位图存储的最大数字
        int map[] = new int[N/32];
        System.out.println(checkBit(map,1));
        setBit(map,1);
        setBit(map,10);
        setBit(map,4);
        System.out.println(checkBit(map,1));
        sortBitArray(map);
    }*/
    public static void main(String[] args){
        int N = 2944;//位图存储的最大数字
        int map[] = new int[N/32];
        System.out.println(checkBit(map,1));
        setBit(map,1);
        setBit(map,10);
        setBit(map,4);
        System.out.println(checkBit(map,1));
        sortBitArray(map);
    }

    private static boolean checkBit(int[] arr,int val){
        return (arr[val/32] & (1<<val%32))!=0;
    }
    private static void setBit(int[] arr,int val){
        arr[val/32] |= 1<<val%32;
    }
    public static void sortBitArray(int[] bitArray) {
        int count = 0;
        for (int i = 0; i < 1024; i++) {
            if (checkBit(bitArray, i)) {
                System.out.print(count + "\t");
            }
            count++;
        }
    }
        
    /*public static void main(String[] args) throws Exception {
            String idcard15 = "130321860311519";
            String idcard18 = "210102198617083732";//
            String idcard="610**************";
            //自己身份证测试
            System.out.println(isValidatedAllIdcard(idcard));
            // 15位身份证
            //System.out.println(isValidatedAllIdcard(idcard15));
            // 18位身份证
            //System.out.println(isValidatedAllIdcard(idcard18));
            // 15位身份证转18位身份证
            //System.out.println(convertIdcarBy15bit(idcard15));
        }*/
    }

