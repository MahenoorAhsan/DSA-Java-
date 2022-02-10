package JAVA.OOPS;

import java.util.Scanner;

public class tutrl81_ExceptionHandling {
    public static void main(String[] args) {
        int[] marks=new int[5];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind=sc.nextInt();

        System.out.println("Enter the number you wanna divide the value with: ");
        int number =sc.nextInt();
        try{
            System.out.println("The value at arrray index entered is "+marks[ind]);
            System.out.println("The value of array value divided by number is : "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithematicException occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexoutofBoundException Occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception occured");
            System.out.println(e);
        }
    }
}
