package com.Interface;

import java.util.Properties;

public class Gloab {
    private static String LocalAddress;
    private static  int ServerPort;
    private static  int ClientPort;

    public static String getLocalAddress() {
        return LocalAddress;
    }

    public static void setLocalAddress(String localAddress) {
        LocalAddress = localAddress;
    }

    public static int getServerPort() {
        return ServerPort;
    }

    public static void setServerPort(int serverPort) {
        ServerPort = serverPort;
    }

    public static int getClientPort() {
        return ClientPort;
    }

    public static void setClientPort(int clientPort) {
        ClientPort = clientPort;
    }


    static {
        Properties pt=new Properties();
        LocalAddress=pt.getProperty("LocalAddress");
        //ServerPort= Integer.parseInt(pt.getPropertys("ServerPort"));
        //ServerPort= Integer.parseInt(pt.getProperty("ClientPort"));
    }
}
