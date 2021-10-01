package LinearSearch;
import java.util.Scanner;
import java.util.Arrays;

public class searchInrange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char target=sc.next().charAt(0);
        int strt= sc.nextInt();
        int end=sc.nextInt();
        System.out.println(search(str,target,strt,end));
    }
    static boolean search(String str, char target, int start, int end){
        //char arr[]= Arrays.toString(str.toCharArray());
        for(int i=start;i<=end;i++){
            if(target==str.charAt(i))
            return true;
        }
        return false;


    }
    
}
