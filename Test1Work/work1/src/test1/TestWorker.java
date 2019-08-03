package test1;

import java.util.Comparator;
import java.util.TreeSet;

public class TestWorker {
    public static void main(String[] args) {
        TreeSet<Worker> st=new TreeSet<>(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                int num1=o1.getAge()-o2.getAge();
                int num2=(num1==0)?o1.getName().compareTo(o2.getName()):num1;
                return num2;
            }
        });
        st.add(new Worker("张三",22,8000));
        st.add(new Worker("张三",22,8000));
        st.add(new Worker("张三",25,8000));
        st.add(new Worker("李四",28,7500));
        st.add(new Worker("王五",20,5000));
        for(Worker wk:st){
            System.out.println(wk.toString());
        }
    }
}
