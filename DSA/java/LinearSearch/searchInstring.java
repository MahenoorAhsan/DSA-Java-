package LinearSearch;
import java.util.Arrays;

public class searchInstring {
    public static void main(String[] args){
        String name="Mahenoor";
        char target='r';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,target));

    }
    static boolean search(String str, char target ){
        if(str.length()==0)
        return false;

        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i))
            return true;

        }

        return false;
    }
    
}
