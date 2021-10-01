package LinearSearch;
import java.util.Scanner;
public class linearsearch {

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[] arr= {4,87,23,19,5,32,81,90};
        System.out.println("Enter the element to be search: ");
        int x =in.nextInt();
        int y=ls(arr,x);
        if(y==1)
        System.out.println("Element found");
        else System.out.println("Element not present");
    }
    static int ls(int[] array, int n){
        for(int num: array){
            if(num==n)
            return 1;
        }
        return 0;
    }
    
}
