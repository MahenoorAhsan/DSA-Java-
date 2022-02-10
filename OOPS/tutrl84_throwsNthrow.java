package JAVA.OOPS;

class NegativeRException extends Exception{
    @Override
    public String toString() {
        return "Radius cant be Negative";
    }

    @Override
    public String getMessage() {
        return "Area cant be negative";
    }
}
public class tutrl84_throwsNthrow {
    public static double Area(int r) throws NegativeRException{
        if(r<0){
            throw new NegativeRException();
        }

        double result=Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{

        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
           int c=divide(6,2);
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println("Exception");
        }

    }
}
