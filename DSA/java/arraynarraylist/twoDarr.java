package arraynarraylist;
import java.util.Scanner;

import java.util.Arrays;
public class twoDarr {
    public static void  main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //int[][] arr= new int [3][]; type of declaration where for initialization row must be intialized so  
    
    int[][] array = { {1,2,3 }, {4,5} ,{6,7,8,9} }; 
    for(int x=0;x<array.length;x++){
        for(int y=0;y<array[x].length;y++)
        {
            System.out.print(array[x][y]+" ");
        }
        System.out.println();
    }

    int[][] arr=new int[3][3];
    for(int row =0;row<arr.length;row++) {
        for(int col=0;col<arr[row].length;col++){
            arr[row][col]=sc.nextInt();
        }
     }
     for(int row =0;row<arr.length;row++) {
        for(int col=0;col<arr[row].length;col++){
            System.out.print(arr[row][col]+" ");
        }
        System.out.println();
     }
     for(int row =0; row< arr.length;row++) {
            System.out.println(Arrays.toString(arr[row])); //2nd method to print matrix
    }
    for(int[] a : arr) {
        System.out.println(Arrays.toString(a));}
        //3rd method to display 
    }
}

