package com.TCPtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Socketer {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(Global.SERVER_IP, Global.SERVER_PORT);
        OutputStream output = socket.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals("88")) {
                break;
            }
            output.write(str.getBytes());

//            System.out.println("发送出去了一次!");
        }
        output.close();
        socket.close();
    }
}
