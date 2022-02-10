package JAVA.OOPS;

public class tutrl80_tryCatch {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        //without Try
       /* int c=a/b;
        System.out.println("The result is "+c); program will directly exit after the exception
        no further steps will be executed in this case */
        //with try
        try{
            int c=a/b;
            System.out.println("The result is "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide :Reason: ");
            System.out.println(e);
        }
        System.out.println("End of program"); // this will not be executed in case of Without try
    }
}
