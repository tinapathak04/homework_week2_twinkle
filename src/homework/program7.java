package homework;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

         import java.util.Scanner;
public class program7
{
    public static void main(String[] Strings)
    {
        myName();
    }
   public static void myName(){
                Scanner input = new Scanner(System.in);

                System.out.print("Input a degree in Fahrenheit: ");
                double fahrenheit = input.nextDouble();

                double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
                System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
            }
        }



