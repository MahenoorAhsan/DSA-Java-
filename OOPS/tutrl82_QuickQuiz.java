package JAVA.OOPS;

import java.util.Scanner;

public class tutrl82_QuickQuiz {
    public static void main(String[] args) {
        //write a java program that allows you to keep accessing an array until a valid index is given by the user
        int[] marks=new int[5];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        boolean flag =true;
        while(flag) {
            System.out.println("Enter the value of index: ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video number 82");
                try {
                    System.out.println(marks[ind]);
                    flag =false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index is out of bound");
                    System.out.println(e);
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in Level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
