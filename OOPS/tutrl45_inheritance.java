package OOPS;

class Base{
    int x;
    public int getx(){
        return x;
    }
    public void Setx(int p){
        System.out.println("I am in base and setting x now");
        x=p;
    }

    void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    int y;
     public int gety(){
         return y;
     }
    
     public void sety(int p){
         y=p;
     }
     
}
public class tutrl45_inheritance {
    public static void main(String[] a){
        Base b= new Base();
        b.Setx(6);
        System.out.println(b.getx());

        Derived k= new Derived();
        k.Setx(9);
        System.out.println(k.getx());
    }
    
}
