package OOPS;
//interfaces
interface Bicycle {
    int a=45; // properties of interface is final
    void applybrake(int decrement);
    void speedup(int decrement);
}
interface HornOfBicycle{
    void softMusic();
    void RockMusic();
}
class Avoncycle implements Bicycle,HornOfBicycle {
    int speed = 7;

    void BlowHorn() {
        System.out.println("Sound of horn ");
    }
    public void applybrake(int decrement){

        speed=speed-decrement;
    }
    public void speedup(int increment){

        speed=speed+increment;
    }
    public void softMusic(){
        System.out.println("playing soft music as horn");
    }
    public void RockMusic() {
        System.out.println("playing Rock music as horn");
    }

}
public class tutrl54 {
    public static void main(String[] args) {
        Avoncycle obj=new Avoncycle();
        obj.BlowHorn();
        obj.applybrake(4);
        System.out.println("speed, after applying brake is "+obj.speed);
        obj.speedup(25);
        System.out.println("speeding up by "+obj.speed);
        // you can create properties in interfaces
        System.out.println(obj.a);
        //obj.a=67;
        //you can not modify the properties in interfaces as they are final

        obj.softMusic();
        obj.RockMusic();


    }
}
