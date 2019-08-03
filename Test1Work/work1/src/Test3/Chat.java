package Test3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Chat {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost(), 8888);
        Thread read = new ReadServer(s);
        Thread write = new WriteServer(s);
        read.start();
        write.start();
    }
}

class ReadServer extends Thread {
    Socket s;

    public ReadServer(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            InputStream is = s.getInputStream();
            byte[] bys = new byte[250];
            int len = 0;
            while ((len = is.read(bys)) != -1) {
                String str = new String(bys, 0, len);
                System.out.println(str);
                if (str.equals("服务器:88")) {
                    is.close();
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class WriteServer extends Thread {
    Socket s;

    public WriteServer(Socket s) {
        this.s = s;
    }

    public Socket getS() {
        return s;
    }

    public void setS(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            OutputStream os = s.getOutputStream();
            BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String to_Server = "客户端:" + bf2.readLine();
                os.write(to_Server.getBytes());
                os.flush();
                if (to_Server.equals("88")) {
                    bf2.close();
                    os.close();
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
