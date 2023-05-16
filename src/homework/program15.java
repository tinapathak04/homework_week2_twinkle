package homework;

import java.util.Scanner;
public class program15 {
    public static void main(String[] args) {
        myName();

    }

    public static Scanner tv = new Scanner(System.in);

    public static void myName() {
        System.out.print("Input the first number: ");
        int x = tv.nextInt();
        System.out.print("Input the second number: ");
        int y = tv.nextInt();
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("Swapped values of first value and second value:" + x + " and " + y);
    }
}




