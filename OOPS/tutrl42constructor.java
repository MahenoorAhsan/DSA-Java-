package OOPS;

class MymainEmployee{
    private int id;
    private String name;

    public MymainEmployee(){
        id=45;
        name ="CodeWithHarry";
    }
    public MymainEmployee(String s){
        name=s;
    }
    public void setName(String n){name=n;}
    public String getName(){return name;}
    public void setId(int i){ id=i; }
    public int getId() { return id; }
}


public class tutrl42constructor {
    public static void main(String[] a){
    MymainEmployee harry=new MymainEmployee();
    MymainEmployee obj=new MymainEmployee("Mahenoor Ahsan");
    System.out.println(harry.getId()+" "+harry.getName());
    System.out.println(obj.getId()+" "+obj.getName());
        
    }
    
}
