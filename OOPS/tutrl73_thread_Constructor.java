package JAVA.OOPS;


class MyThr extends Thread{
    public MyThr(String name){// name of thread
        super(name);
    }
    public void run(){
        int i=0;
        while(i<8){
            System.out.println("I am a thread");
            i++;
        }
    }
}
class MyThr2 implements Runnable{
    public MyThr2(Runnable r){
        System.out.println("The Runnable is "+r);
    }
    public void run(){
        System.out.println("implementing Runnable ");
    }
}
public class tutrl73_thread_Constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("harry");
        t.start();
        System.out.println("The id of the thread is " + t.getId());
        System.out.println("The name of the thread is " + t.getName());
        System.out.println("The priority of the thread is " + t.getId());
        System.out.println("The state of the thread is " + t.getState());
        MyThr t2=new MyThr("Mahi");
        MyThr2 rnbl =new MyThr2(t2);
        t2.start();

    }
}
