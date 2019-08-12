package com;

public class Test2 {
    public static void main(String[] args) {
        try {
            new A().format("1");
        } catch (MtException e) {
            e.printStackTrace();
        }
    }
}
class MtException extends Exception{
    MtException(){}
}
class A{
    public int format(String str) throws MtException{
        int i=Integer.valueOf(str);
        return i;
    }
}
