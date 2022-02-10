package JAVA.OOPS;
// custom or user defined packages in java
//import packages;
//method 1 import everything from a package using *
//import java.util.*;
//method 2 import a packages
//import java.util.Scanner;

public class tutrl65 {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        // method 3 using without importing package
        java.util.Scanner sc =new java.util.Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("This is my Scanner Taking input as "+a);

    }
}
