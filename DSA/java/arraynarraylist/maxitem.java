package arraynarraylist;
//import java.util.Scanner;

public class maxitem {
    public static void main(String[] args){
  //  Scanner in =new Scanner(System.in);
    int[] arr={2,9,54,73,12,64};
    System.out.println("maximum is "+max(arr));
    }

    static int max(int[] arr){
        int lar=arr[0];
        for(int i=0;i<arr.length;i++ ){ 
            if(arr[i]>lar) {
                lar=arr[i];
            }
        }
        return lar;

    }
}
