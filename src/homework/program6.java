package homework;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

     import java.util.Scanner;

public class program6

{
    public static void main(String[] args)
    {
        myMethod();
    }
    public static void myMethod(){
       double radius,area;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();


        area  = Math.PI * radius * radius;
        System.out.println("Area of the circle is" + area);
    }
}
