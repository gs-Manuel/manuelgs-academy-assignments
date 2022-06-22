import algorithms.MathUtilities;
import util.SimpleUtil;

public class Main {
    public static void main(String[] args) {
        if(MathUtilities.evenNumber(SimpleUtil.askNumber())){
            System.out.println("This number is even, you can pass. ");
        }
        else{
            System.out.println("This number is not even, you shall not pass. ");
        }
    }
}
