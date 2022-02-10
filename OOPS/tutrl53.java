package OOPS;
//abstract class
abstract class Baseclass2{
    public Baseclass2(){
        System.out.println("I am a constructor of base 2");
    }
    public void say(){
        System.out.println("Say hello!!");
    }
    abstract public void greet();
    abstract public void greet2();
}
class superclass2 extends Baseclass2{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
    abstract class superclass3 extends  Baseclass2{
    public void th(){
        System.out.println("I am good");
    }
}
public class tutrl53 {
    public static void main(String[] args) {
        //Baseclass2 b=new Baseclass2() ;//not allowed coz it is a abstract class
        //we can not make object of a abtracct class
        superclass2 s=new superclass2();
        //superclass3 s3=new superclass3(); not allowed coz it is a abstract class
    }

    }
}
