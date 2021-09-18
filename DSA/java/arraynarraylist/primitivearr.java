package arraynarraylist;
import java.util.Arrays;
import java.util.Scanner;
class primitivearr {
     public static void main(String[] a) {
         Scanner in = new Scanner(System.in);
         int[] arr=new int[6];
         for(int i=0;i<6;i++)
         {
             int x=in.nextInt();
             arr[i]=x;
         }
         for(int num:arr)
         System.out.print(num+" ");

// object array 
String[] str=new String[4];
for(int i=0;i<4;i++)
{
    str[i]=in.next();
}
for(String num:str)
System.out.print(num +" ");

System.out.println(Arrays.toString(str));

    }
}
