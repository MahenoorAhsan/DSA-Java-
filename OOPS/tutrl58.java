package JAVA.OOPS;
//inheritance in interface
interface Sample{
    void meth1();
    void meth2();
}
interface Samplechild extends Sample{
    void meth3();
    void meth4();
}
class MySampleclass implements Samplechild{
    public void meth1(){
        System.out.println("This is method 1 of Sample interface");
    }
    public void meth2(){
        System.out.println("This is method 2 of Sample interface");
    }
    public void meth3(){
        System.out.println("This is method 3 of Samplechild Interface");
    }
    public void meth4(){
        System.out.println("This is method 4 of Sample Child Interface");
    }
    
}
public class tutrl58 {
    public static void main(String[] args) {
        MySampleclass obj=new MySampleclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }

}
