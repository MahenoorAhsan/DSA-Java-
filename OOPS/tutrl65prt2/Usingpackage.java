package JAVA.OOPS.tutrl65prt2;
import codewithharry.gym.HarryGym;
import org.w3c.dom.ls.LSOutput;

class using extends HarryGym{
    void meth2(){
        System.out.println(x);
        System.out.println(y);
      //  System.out.println(z); // default and private cant be accessed
       // System.out.println(a);

    }

}
public class Usingpackage {
    public static void main(String[] args) {
        System.out.println("I am using the packages");
        HarryGym g=new HarryGym();
        using c=new using();
        c.meth2();

    }
}

