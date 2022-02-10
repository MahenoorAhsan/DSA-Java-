package JAVA.OOPS;

import java.sql.SQLOutput;

// Multiple inheritance in java by interface
interface Camera{
    void takesnap();
    void recordvideo();
    private void greet(){ // cant access directly

        System.out.println("Good Morning");
    }
    //default method
    default void recordin4k(){
        greet();
        System.out.println("Recording video in 4K");
    }

}
interface wifi{
    String[] getNetworks();
    void connectsToNetworks(String network);
}
class MyCellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling "+phonenumber);
    }
    void pickcall(int phonenumber){
        System.out.println("connected to "+phonenumber);
    }
}
class MySmartphone extends MyCellPhone implements wifi , Camera {
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public void recordvideo(){
        System.out.println("Recording video");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList={"Harry","Mahenoor","hostel"};
        return networkList;
    }

    @Override
    public void connectsToNetworks(String network) {
        System.out.println("Connecting to "+network);
    }
    /*@Override
    public void recordin4k(){
        System.out.println("Recording video in high quality in 4k");*/


}
public class tutrl56 {
    public static void main(String[] args) {
        MySmartphone ms= new MySmartphone();
        String[] ar=ms.getNetworks();
        for (String item:ar){
            System.out.println(item);
        }
        ms.recordin4k();
    }


}
