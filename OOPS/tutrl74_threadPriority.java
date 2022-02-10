package JAVA.OOPS;

class MyThr1 extends Thread{
    public MyThr1(String name){// name of thread
        super(name);
    }
    public void run(){
       // while (true) {
            System.out.println(this.getName());
       // }
    }
}
public class tutrl74_threadPriority {
    public static void main(String[] args) {
        //ready queue  : threads that are ready to run
        MyThr1 T1=new MyThr1("Mahenoor");
        MyThr1 T2=new MyThr1("Swati");
        MyThr1 T3=new MyThr1("kuki");
        MyThr1 T4=new MyThr1("Harshita");
        MyThr1 T5=new MyThr1("rohit");
        T5.setPriority(Thread.MAX_PRIORITY);
        T1.setPriority(Thread.MIN_PRIORITY);
        T4.setPriority(Thread.NORM_PRIORITY);
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();
    }
}
