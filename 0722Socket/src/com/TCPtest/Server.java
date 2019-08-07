package com.TCPtest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket severSocket = new ServerSocket(Global.SERVER_PORT);
        Socket socket = severSocket.accept();
        System.out.println("已连接");
        InputStream is = socket.getInputStream();
        System.out.println("接受到了");
        BufferedInputStream bf = new BufferedInputStream(is);
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("E:\\IOTest\\a.mp4"));
        //byte[] bys=new byte[1024];
        int temp=0;
//        while ((temp  = bf.read(bys)) != -1) {
////            System.out.println("我是接收到了");
////            System.out.println(temp);
//            bw.write(bys,0,temp);
//            bw.flush();
        while ((temp  = bf.read()) != -1) {
//            System.out.println("我是接收到了");
//            System.out.println(temp);
            bw.write(temp);
            bw.flush();
//            System.out.println("写入一次");
        }
        bw.close();
        is.close();
        severSocket.close();
    }
}
