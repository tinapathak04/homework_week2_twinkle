package homework;
/**
 * Write a program to calculate the area of a triangle.
 */
import java.util.Scanner;
public class program8 {

    public static void main(String[] args)
    {
        myMethod();
    }
     public static void myMethod(){
        Scanner tv = new Scanner(System.in);
        System.out.println("Enter the width of Triangle:");
        double base = tv.nextDouble();

        System.out.println("Enter the height of Triangle:");
        double height = tv.nextDouble();

        //Area = (width*height)/2
        double area = (base* height)/2;
        System.out.println("Area of Triangle is: " + area);

    }
}
