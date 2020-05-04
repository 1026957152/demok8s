package com.coalvalue.employee.util;

import java.util.Random;
import java.util.UUID;

/**
 * Created by Administrator on 2015/10/1.
 */
public class GenerateShortUUID {

    private GenerateShortUUID() { } // singleton
    private final static char[] chAarry = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

    private final static char[] numberAarry = "0123456789".toCharArray();

    public static String next() {
        UUID u = UUID.randomUUID();
        return toIDString(u.getMostSignificantBits()) + toIDString(u.getLeastSignificantBits());
    }

    private static String toIDString(long i) {
        char[] buf = new char[32];
        int z = 64; // 1 << 6;
        int cp = 32;
        long b = z - 1;
        do {
            buf[--cp] = DIGITS66[(int)(i & b)];
            i >>>= 6;
        } while (i != 0);
        return new String(buf, cp, (32-cp));
    }

    // array de 64+2 digitos
    private final static char[] DIGITS66 = {
            '0','1','2','3','4','5','6','7','8','9',        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
            '-','.','_','~'
    };


    public static String generateRandomNumberCode(int count, boolean isNumber) {
        StringBuilder strRand = new StringBuilder();
        Random random = new Random();
        if(isNumber){
            for (int i = 0; i < count; i++) {
                strRand.append(numberAarry[random.nextInt(numberAarry.length)]);

            }
        }else {
            for (int i = 0; i < count; i++) {
                strRand.append(chAarry[random.nextInt(chAarry.length)]);

            }
        }

        return strRand.toString();
    }


}

/*
public class IdFactoryImpl implements IdFactory {
    private final String hostName;
    private final long creationTimeMillis;
    private long lastTimeMillis;
    private long discriminator;

    public IdFactoryImpl() throws UnknownHostException {
        this.hostName = InetAddress.getLocalHost().getHostAddress();
        this.creationTimeMillis = System.currentTimeMillis();
        this.lastTimeMillis = creationTimeMillis;
    }

    public synchronized Serializable createId() {
        String id;
        long now = System.currentTimeMillis();

        if (now == lastTimeMillis) {
            ++discriminator;
        } else {
            discriminator = 0;
        }

        // creationTimeMillis used to prevent multiple instances of the JVM
        // running on the same host returning clashing IDs.
        // The only way a clash could occur is if the applications started at
        // exactly the same time.
        id = String.format("%s-%d-%d-%d", hostName, creationTimeMillis, now, discriminator);
        lastTimeMillis = now;

        return id;
    }

    public static void main(String[] args) throws UnknownHostException {
        IdFactory fact = new IdFactoryImpl();

        for (int i=0; i<1000; ++i) {
            System.err.println(fact.createId());
        }
    }
}*/