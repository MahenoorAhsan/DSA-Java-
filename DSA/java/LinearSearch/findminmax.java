package LinearSearch;

public class findminmax {
    public static void main(String[] args){
        int nums[]={67,87,32,18,73,46,64,52,82,12,92};
        System.out.println("Minimum number is :" +min(nums));
        System.out.println("Maximum number is : "+ max(nums));
    }
    static int min(int[] arr){
        int mini=arr[0];
        for(int num:arr){
            if(num<mini)
            mini=num;
        }
        return mini;
    }
    static int max(int[] arr){
        int maxi=arr[0];
        for(int num:arr){
            if(num>maxi)
            maxi=num;
        }
        return maxi;
    }
}
