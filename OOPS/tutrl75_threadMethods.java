package JAVA.OOPS;


class MyNewThr1 extends Thread{

    public void run(){
        //while(true){
            System.out.println("I am a thread1");
            try{
                Thread.sleep(45);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        //}
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        //while(true){
            System.out.println("I am a thread2");
       // }
    }
}
public class tutrl75_threadMethods {
    public static void main(String[] args) {
        MyNewThr1 t1=new MyNewThr1();
        MyNewThr2 t2=new MyNewThr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
