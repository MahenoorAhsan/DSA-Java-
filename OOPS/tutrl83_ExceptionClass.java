package JAVA.OOPS;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am to String ";
    }
    @Override
    public String getMessage() {
        return  " I am getMessage";
    }
}
class MaxAge extends Exception{
    @Override
    public String toString() {
        return "Age cant be more than 125";
    }
    @Override
    public String getMessage() {
        return  "Age overv 125 is invalid";
    }
}
public class tutrl83_ExceptionClass {
    public static void main(String[] args) {
        int a=8;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try {
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age>=125){
            try {
                throw new MaxAge();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
        else
            System.out.println("valid age");
    }
}
