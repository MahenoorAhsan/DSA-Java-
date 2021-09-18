package arraynarraylist;
import java.util.Arrays;
public class passinginfunc {
    public static void main(String arr[])
    {
        int[] nums={3,4,5,8};
        System.out.println(Arrays.toString(nums));//num is reference variable
        change(nums);//original object gets changed  called mutable beahviour
        System.out.println(Arrays.toString(nums));
    }
    static void change(int arr[])//arr is copy of reference varialble passed in function
    {
        arr[0]=99;//nums and arr both are pointing to same objet 
//In java arrays are mutable and strings are not
    }

    
}
