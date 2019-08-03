package Test3;


import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();
        System.out.println("客户端已连接");
        Thread threada = new ReadClient(socket);
        Thread threadb = new WriteClient(socket);
        threada.start();
        threadb.start();
    }
}
class ReadClient extends Thread {
    Socket s;

    public Socket getS() {
        return s;
    }

    public void setS(Socket s) {
        this.s = s;
    }

    public ReadClient(Socket s) {
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
                if (str.equals("客户端:88")) {
                    is.close();
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class WriteClient extends Thread {
    Socket s;

    public Socket getS() {
        return s;
    }

    public void setS(Socket s) {
        this.s = s;
    }

    public WriteClient(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            OutputStream os = s.getOutputStream();
            BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String to_Client = "服务器:" + bf2.readLine();
                os.write(to_Client.getBytes());
                os.flush();
                if (to_Client.equals("88")) {
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
