package com.udptest;

import com.TCPtest.Global;

import java.io.IOException;
import java.net.*;

import  com.TCPtest.Global;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket clientsocket = new DatagramSocket(Global.CLIENT_PORT);
        String str = "你好Idea";
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName(Global.SERVER_IP),Global.SERVER_PORT);
        clientsocket.send(dp);

//        DatagramPacket dq = new DatagramPacket(new byte[1024], new byte[1024].length);
//        clientsocket.receive(dq);
//        byte[] info = dq.getData();
//        System.out.println(new String(info, 0, dq.getLength()));
        clientsocket.close();
    }
}
