package util;


import java.util.Scanner;

public class SimpleUtil {

    public static int askNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: "+"\n");
        return sc.nextInt();
    }
}
