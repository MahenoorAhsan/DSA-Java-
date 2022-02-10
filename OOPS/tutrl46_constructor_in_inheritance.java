package OOPS;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }

    Base1(int a){
        System.out.println("I am an overload constructor with a value of a as: "+a);
    }
    public int x;
    
    public int getX(){
        return x;
    }

    public void setX(int p){
        x=p;
    }
}
class Derived1 extends Base1{
    Derived1(){
        //super(7);// if we want to run the constructor of base class with parameter
        System.out.println("I am a derived class constructor");
    }
     
    Derived1(int x,int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with a value of b as:"+y);
    }
    int y;
     public int gety(){
         return y;
     }
    
     public void sety(int p){
         y=p;
     }
}
class derivedchild extends Derived1{
    derivedchild(){
        System.out.println("I am a child of Derived1 class");
    }
    derivedchild(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of derivedchild with a value of c as:"+z);
    }
}
public class tutrl46_constructor_in_inheritance{
    public static void main(String[] args) {
        Base1 b=new Base1();
        System.out.println("base ends");
        Derived1 d=new Derived1();// first it calls base cls constructor then derived class constructor
        System.out.println("Derived1 d ends ");
        Derived1 c=new Derived1(14,9);
        System.out.println("Derived1 c ends ");
        derivedchild e=new derivedchild(18, 92, 13);
        System.out.println("Derivedchild e ends ");
        
    }
}