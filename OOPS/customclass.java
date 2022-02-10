package OOPS;
 
class college{  
    int roll;
    String name;
}

public class customclass {
    public static void main(String[] args){
        System.out.println("This is ourclass");
        college mahi=new college();
        mahi.roll=12;
        mahi.name="Mahenoor Ahsan";
        System.out.println(mahi.roll+" "+mahi.name); 
    }
    
}
