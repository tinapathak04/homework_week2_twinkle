package homework;

/**
 * Write a Java program to add two binary numbers.
 *
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 *
 * Sum of two binary numbers: 101
 */
import java.util.Scanner;
public class program16 {
    private static Scanner obj =new Scanner(System.in);
    public static void main(String[] args)
    {
        myMethod();
    }
 public static void myMethod(){
     System.out.println("Input first binary number: ");
     String b1= obj.next();
     System.out.println("Input second binary number: ");
     String b2 = obj.next();

     int num1 = Integer.parseInt(b1,2);
     int num2 = Integer.parseInt(b2,2);

     int output = num1 + num2;

     System.out.println("Sum of two binary numbers: ");
     System.out.println(Integer.toBinaryString(output));

    }
}
