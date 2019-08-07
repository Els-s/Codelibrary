package com.TCPtest2;

import com.TCPtest.Global;

import java.io.*;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(Global.SERVER_IP, Global.SERVER_PORT);
        OutputStream output = socket.getOutputStream();
        FileInputStream br =new FileInputStream(new File("D:\\JAVA学习资料\\" +
                "Java课程培训第一阶段\\Day19线程\\03视频\\01.死锁.MP4"));
        int temp=0;

        // 1b
        // 1k
        // 1 m
        // 4 m
        // socket   没有buffer 缓冲数组  速度慢
        // socket   没有buffer 缓冲数组  速度慢
        // socket   没有buffer 缓冲数组  速度慢
        byte[] bys=new byte[1024];
        while ((temp=br.read(bys))!=-1){
            output.write(bys,0,temp);
            output.flush();
        }
        output.close();
        br.close();
        socket.close();
    }
}
