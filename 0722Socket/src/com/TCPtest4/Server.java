package com.TCPtest4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);
        Socket s= ss.accept();
        System.out.println("服务器已连接");
        InputStream is= s.getInputStream();
        byte[] bys=new byte[1024];
        int temp=0;
        while ((temp=is.read(bys))!=-1){
            System.out.println(new String(bys,0,temp));
        }
        s.shutdownInput();
        OutputStream os= s.getOutputStream();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str= "";
        while ((str=bf.readLine())!=null){
            System.out.println("已发送了数据");
            os.write(str.getBytes());
            os.flush();
        }
        if (str.equals("88")) {
            os.close();
            bf.close();
            is.close();
        }
    }
}
