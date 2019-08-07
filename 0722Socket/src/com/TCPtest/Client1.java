package com.TCPtest;

import java.io.*;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(Global.SERVER_IP, Global.SERVER_PORT);
        OutputStream output = socket.getOutputStream();
        BufferedOutputStream bos=new BufferedOutputStream(output);
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(new File("D:\\JAVA学习资料\\" +
                "Java课程培训第一阶段\\Day19线程\\03视频\\01.死锁.MP4")));
        int temp=0;
        /*使用*/
        //byte[] bys=new byte[1024];
//        while ((temp=br.read(bys))!=-1){
////            String str = br.readLine();
////            System.out.println(temp);
//            output.write(bys,0,temp);
//            output.flush();
//        }
        while ((temp=br.read())!=-1){
            output.write(temp);
            output.flush();
        }
//            System.out.println("发送出去了一次!");
        output.close();
        br.close();
        socket.close();
    }
}
