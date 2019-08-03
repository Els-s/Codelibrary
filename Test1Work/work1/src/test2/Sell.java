package test2;

public class Sell {
    public static void main(String[] args) {
        Thread work1=new Work();
        Thread work2=new Work();
        Thread work3=new Work();
        Thread work4=new Work();
        Thread work5=new Work();
        work1.setName("窗口1");
        work2.setName("窗口2");
        work3.setName("窗口3");
        work4.setName("窗口4");
        work5.setName("窗口5");
        work1.start();
        work2.start();
        work3.start();
        work4.start();
        work5.start();
    }
}
class Work extends Thread{
    public Work(){

    }
    private static int  P=100;

    public void run(){
        while (true){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized ("Lock"){
                if(P>0){
                    System.out.println(Work.currentThread().getName()+"卖出第"+P+"张票");
                    --P;
                }else{
                    System.out.println("票买完了");
                    return;
                }
            }
        }
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

}