package com.udptest;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Udpserver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入聊天信息:");
        String sts = input.next();
        String str = getDate(sts);
        DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("192.168.1.19"), 2425);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }

    public static String getDate(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("1.0:");
        sb.append(System.currentTimeMillis() + ":");
        sb.append("黄泽坤");
        sb.append("192.168.1.56:");
        sb.append("32:");
        sb.append(str + ":");
        return sb.toString();
    }
}

