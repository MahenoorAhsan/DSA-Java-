package JAVA.OOPS;
// polymorphism in interfaces
interface Camera2{
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
interface wifi2{
    String[] getNetworks();
    void connectsToNetworks(String network);
}
class MyCellPhone2{
    void callNumber(int phonenumber){
        System.out.println("Calling "+phonenumber);
    }
    void pickcall(int phonenumber){
        System.out.println("connected to "+phonenumber);
    }
}
class MySmartphone2 extends MyCellPhone2 implements wifi2 , Camera2 {
    public void takesnap() {
        System.out.println("Taking snap");
    }

    public void recordvideo() {
        System.out.println("Recording video");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry", "Mahenoor", "hostel"};
        return networkList;
    }

    @Override
    public void connectsToNetworks(String network) {
        System.out.println("Connecting to " + network);
    }

    @Override
    public void recordin4k() {
        System.out.println("Recording video in high quality in 4k");
    }
    public void samplemethod(){
        System.out.println("Sample method of smart phone");
    }
}
public class tutrl59 {
    public static void main(String[] args) {
        Camera2 cam1=new MySmartphone2() ;//this is smartphone but use it as camera
        //  cam1.getNetworks(); this is not  allowed because camera object cant use wifi facility
        //cam1.samplemethod(); cant use coz method of smartphone
        cam1.recordin4k();
        MySmartphone2 s=new MySmartphone2();
        s.samplemethod();
        s.recordvideo();
        s.callNumber(766725636);
    }
}
