package com.TCPtest3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket(InetAddress.getLocalHost(),8888);
        Thread t1 =new Thread(new Tearedclient(s));
        //Thread t2 =new Thread(new Tearedclient(s));
        //Thread t3 =new Thread(new Tearedclient(s));
        //Thread t4 =new Thread(new Tearedclient(s));
        //Thread t5 =new Thread(new Tearedclient(s));
        t1.start();
        //t2.start();
        //t3.start();
        //t4.start();
        //t5.start();
    }
}
