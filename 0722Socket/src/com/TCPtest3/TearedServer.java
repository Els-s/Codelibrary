package com.TCPtest3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TearedServer implements Runnable {
    private Socket s;

    public Socket getS() {
        return s;
    }

    public void setS(Socket s) {
        this.s = s;
    }

    public TearedServer(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            InputStream is = s.getInputStream();
            String str="图片"+ System.currentTimeMillis()+".jpeg";
            BufferedOutputStream bf=new BufferedOutputStream(new FileOutputStream("str"));
            byte[] bys = new byte[1024];
            int temp = 0;
            while ((temp = is.read(bys)) != -1) {
                bf.write(bys, 0, temp);
                bf.flush();
            }
            if ((temp = is.read(bys)) == -1) {
                is.close();
                bf.close();
                s.close();
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
