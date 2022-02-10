package JAVA.OOPS;

import java.util.Scanner;

public class tutrl82_NestedTryCatch {
    public static void main(String[] args) {
        int[] marks=new int[5];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of index: ");
        int ind=sc.nextInt();
        try {
            System.out.println("Welcome to video number 82");
            try {
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index is out of bound");
                System.out.println(e);
                System.out.println("Exception in level 2");
            }
        }
        catch (Exception e) {
            System.out.println("Exception in Level 1");
        }
    }

}
