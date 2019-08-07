package com.udptest;

import com.TCPtest.Global;

import java.io.IOException;
import java.net.*;

public class Serverudp {
    public static void main(String[] args) throws IOException {
        DatagramSocket da = new DatagramSocket(Global.SERVER_PORT,InetAddress.getByName(Global.SERVER_IP));
        System.out.println("渣男小分队的群聊开始:");
        DatagramPacket dp = new DatagramPacket(new byte[1024], new byte[1024].length);
        boolean flag=true;
        while (flag=true){
            da.receive(dp);
            byte[] data = dp.getData();
            System.out.println(dp.getAddress()+"说:"+new String(data, 0, dp.getLength()));
            DatagramPacket sty=new DatagramPacket("已收到!".getBytes(),"已收到!".getBytes().length,dp.getAddress(),4788);
            da.send(sty);
//            DatagramPacket dq=new DatagramPacket()
        }
//        String str="收到了!";
//        DatagramPacket dq=new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName(Global.CLIENT_IP),Global.CLIENT_PORT);
//        da.send(dq);
        da.close();
    }
}
