package JAVA.OOPS;

class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("My Thread is Running");
            System.out.println("I am cooking food");
            i++;
        }

    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<40000){//while (true) condition shows that thread1 runs for same time then thread2 runs for same
            // span of time and this goes for infinite time
            System.out.println("My Thread2 is  Running");
            System.out.println("I am chatting with her");
            i++;
        }

    }
}
public class tutrl70 {
    public static void main(String[] args) {
        MyThread1 T1=new MyThread1();
        MyThread2 T2=new MyThread2();
        T1.start();
        T2.start();


    }
}
