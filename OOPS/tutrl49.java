package OOPS;

class phone{
    public void showtime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("playing music");
    }
    public void on(){
        System.out.println("Turnong on smartphone..");
    }

}

public  class tutrl49 {
    public static void main(String[] args) {
        phone obj=new smartphone();// it is allowed
        // showtime obj= new phone(); // not allowed
        obj.showtime();
        obj.on();
        //obj.music();not allowed
    }

}
