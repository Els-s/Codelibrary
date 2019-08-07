package com.TCPtest3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);
        Socket s=ss.accept();
        new Thread(new TearedServer(s)).start();

    }
}
