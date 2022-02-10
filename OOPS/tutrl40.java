package OOPS;
//Access  modifier and constructor 
//getter and setter
class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class tutrl40 {
    public static void main(String[] args){
        MyEmployee harry= new MyEmployee();
       // harry.id=45; // throws an error due private accesss modifier
        //harry.name="codewithharry";
        harry.setName("CodewithHarry");
        System.out.println(harry.getName());
        harry.setId(43);
        System.out.println(harry.getId());
    }
}
