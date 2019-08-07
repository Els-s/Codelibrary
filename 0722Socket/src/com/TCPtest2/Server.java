package com.TCPtest2;

import com.TCPtest.Global;

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
        FileOutputStream bw =new FileOutputStream("E:\\IOTest\\a.mp4");
        byte[] bys=new byte[1024];
        int temp=0;
        while ((temp  = is.read(bys)) != -1) {
            bw.write(bys,0,temp);
            bw.flush();
        }
        bw.close();
        is.close();
        severSocket.close();
    }
}
