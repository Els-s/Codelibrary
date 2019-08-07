package com.TCPtest4;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket(InetAddress.getLocalHost(),8888);
        OutputStream os= s.getOutputStream();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str= "";
        while ((str=bf.readLine())!=null){
            os.write(str.getBytes());
            os.flush();
        }
        s.shutdownInput();
        InputStream is= s.getInputStream();
        System.out.println("我已经接收");
        byte[] bys=new byte[1024];
        int temp=0;
        while ((temp=is.read(bys))!=-1){
            System.out.println(new String(bys,0,temp));
        }
        if (str.equals("88")) {
            os.close();
            bf.close();
            is.close();
        }
    }
}
