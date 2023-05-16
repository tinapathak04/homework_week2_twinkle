package homework;
/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

import java.util.Scanner;
public class program13 {

    public static void main(String[] args)
    {

       myMethod();

    }

    public static void myMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double a = sc.nextDouble();
        System.out.println("Input the second number: ");
        double b = sc.nextDouble();
        System.out.println("Input the third number: ");
        double c = sc.nextDouble();
        System.out.println("The average value is" + average(a, b, c)+"\n" );
    }
    public static double average(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }

}
