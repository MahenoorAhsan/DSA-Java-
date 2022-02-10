package JAVA.OOPS;

import java.util.*;

public class tutrl91_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(34);
        l2.add(69);
        l2.add(78);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(0,5);
        l1.add(6);
        l1.addAll(0,l2);
        System.out.print("Arraylist L2: ");
        for(int j=0;j<l2.size();j++){
            System.out.print(l2.get(j)+" ");
        }
        l2.clear();
        System.out.println();
        System.out.print("Arraylist L1: ");
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println(l1.contains(7));
        System.out.println("index of " +l1.indexOf(6));
        System.out.println("last index of: "+l1.lastIndexOf(6));
       System.out.println("removing element from l1 " +l1.remove(7));
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
        System.out.print("Arraylist L2: ");
        for(int j=0;j<l2.size();j++){
            System.out.print(l2.get(j)+" ");
        }
    }
}
