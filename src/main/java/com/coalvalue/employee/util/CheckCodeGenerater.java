package com.coalvalue.employee.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * Created by zohu on 1/17/2015.
 */
public class CheckCodeGenerater {

    private final static int width = 83;
    private final static int height = 40;
    private final static char[] chAarry = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();


    public static Color getRandColor(int fc, int bc) {
        Random random = new Random();

        if (fc > 255)
            fc = 255;
        if (bc > 255)
            bc = 255;
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);

        return new Color(r, g, b);
    }

    //generate random font for verify codes
    public static Font getFont(){
        Random random = new Random();
        Font font[] = new Font[5];
        font[0] = new Font("Ravie", Font.PLAIN, 24);
        font[1] = new Font("Antique Olive Compact", Font.PLAIN, 24);
        font[2] = new Font("Forte", Font.PLAIN, 24);
        font[3] = new Font("Wide Latin", Font.PLAIN, 24);
        font[4] = new Font("Gill Sans Ultra Bold", Font.PLAIN, 24);
        return font[random.nextInt(5)];
    }

    public static String generateRandomNumberCode() {
        StringBuilder strRand = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {

            strRand.append(chAarry[random.nextInt(chAarry.length)]);
        }
        return strRand.toString();
    }


    public static BufferedImage getCheckCodeImage(String checkCode){

        //Building specific width,higth and BuffedImage object
        BufferedImage retCodeImage = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);

        //get the graphic object for the image
        Graphics graph = retCodeImage.getGraphics();

        //Color color = graph.getColor();
        graph.setColor(getRandColor(200,250));
        graph.fillRect(0,0,width,height);
        graph.setFont(getFont());

        Random random = new Random();

        // generate some disturbed line to cover the image
        graph.setColor(getRandColor(160, 200));
        for (int i = 0; i < 155; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int x1 = random.nextInt(12);
            int y1 = random.nextInt(12);
            graph.drawLine(x, y, x + x1, y + y1);
        }

        for(int i = 0; i < checkCode.length(); i++) {

            graph.setColor(new Color(20 + random.nextInt(110), 20 + random
                    .nextInt(110), 20 + random.nextInt(110)));

            graph.drawString(String.valueOf(checkCode.charAt(i)), 20 * i + 6, 25);
        }
        graph.dispose();

        return  retCodeImage;
    }
}
