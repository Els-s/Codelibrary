package com;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bs=new BufferedInputStream(new FileInputStream("meinv.jpeg"));
            String str="图片"+ System.currentTimeMillis()+".jpeg";
            BufferedOutputStream bf=new BufferedOutputStream(new FileOutputStream(str));
            //byte[] bys = new byte[1024];
            int temp = 0;
            //while ((temp = bs.read(bys)) != -1) {
            //    bf.write(bys, 0, temp);
            //    bf.flush();
            //}
            while ((temp = bs.read()) != -1) {
                bf.write(temp);
                bf.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
