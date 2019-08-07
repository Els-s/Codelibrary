package com.TCPtest3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Tearedclient implements Runnable{
    private Socket s;

    public Socket getS() {
        return s;
    }

    public void setS(Socket s) {
        this.s = s;
    }

    public Tearedclient(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            OutputStream os = s.getOutputStream();
            FileInputStream bf=new FileInputStream("meinv.jpeg");
            byte[] bys=new byte[1024];
            int temp=0;
            while ((temp=bf.read(bys))!=-1){
                os.write(bys,0,temp);
                os.flush();
            }
            if ((temp=bf.read(bys))==-1) {
                os.close();
                bf.close();
                s.close();
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
