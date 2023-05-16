package homework;
/**
 * Write a Java program to print the area and perimeter of a rectangle.
 *
 * Test Data:
 * Width = 5.5 Height = 8.5
 *
 * Expected Output:
 *
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;
public class program14 {
    public static Scanner tv = new Scanner(System.in);
    public static void main(String[] args)
    {
        number();
    }
public static void number(){
    System.out.println("Enter width");
    float width = tv.nextFloat();

    System.out.println("enter height");
    float height = tv.nextFloat();


    //Area = (width*height)/4
        float area = (width * height) ;
        System.out.println("Area of Rectangle is: " + area);

        float perimeter = 2 * (width + height);
        System.out.println("Perimeter of Rectangle is: " + perimeter);

    }

}
