package JAVA.OOPS;

class Mythreadrunnable1 implements Runnable{
    public void run() {
        //while (true){
        System.out.println("I am a thread 1 not a threat 1");
    //}
    }
}
class Mythreadrunnable2 implements Runnable{
    public void run(){
       // while (true){
            System.out.println("I am a thread 2 not a threat 2");
       // }
    }
}
public class tutrl71_runnable {
    public static void main(String[] args) {
        Mythreadrunnable1 bullet1=new Mythreadrunnable1();
        Thread gun1=new Thread(bullet1);
        Mythreadrunnable2 bullet2=new Mythreadrunnable2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
