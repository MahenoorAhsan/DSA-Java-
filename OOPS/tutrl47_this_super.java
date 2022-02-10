package OOPS;

class Thisclass {
    int a;
    public int getA(){
        return a;
    }
    Thisclass(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}
class Superclass{
    Superclass(int c){
        super();
        System.out.println("I am a constructor");
    }
}

public class tutrl47_this_super {
    public static void main(String[] args) {
       Thisclass obj= new Thisclass(6);
       System.out.println(obj.getA()); 
       Superclass obj1=new Superclass(5);
    }
    
}
