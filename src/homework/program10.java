package homework;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
import java.util.Scanner;
public class program10 {

    public static void main(String[] args)
    {
        myMethod();
    }
  public static void myMethod(){
        Scanner tv = new Scanner(System.in);
        int num1 = tv.nextInt();
        for(int i = 0; i <= 10; ++i)
        {
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }
    }

}
