package JAVA.OOPS;

import java.util.Scanner;

public class tutrl79_errors {
    public static void main(String[] args) {
        // 1.syntax error
        // int a=0 Error: no semicolon
        // b=8; Error: b not declared


        // 2.Logical error
        //write a program to print all prime number between 1 to 10 (Logical Error)
        //logical errror cant be corrected by ide user have to take care of it
        System.out.print(2+" ");
        for(int i=1;i<5;i++){
            System.out.print((2*i+1)+" ");
        }// this will print odd numbers instead of logical error


        // 3.Runtime error
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);
        // if  we give 0 as I/P it will throw an exception


    }
}
