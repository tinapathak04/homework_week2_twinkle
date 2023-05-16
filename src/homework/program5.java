package homework;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

     import java.util.Scanner;

public class program5
{
     public static Scanner tv = new Scanner(System.in);
     public static void main(String[] args)
     {
        addition();
        subtraction();
        program5 obj = new program5();
        obj.multiplication();
        obj.division();
    }
    public static void addition()
    {
        System.out.println("Addition");
        System.out.println("Digit 1: ");
        int a = tv.nextInt();
        System.out.println("Digit 2: ");
        int b = tv.nextInt();
        int result=a+b;
        System.out.println("Addition of" +a+ "and" +b+ "is" +result);
    }
    public static void subtraction()
    {
        System.out.println("Subtraction");
        System.out.println("Digit 1: ");
        int a = tv.nextInt();
        System.out.println("Digit 2: ");
        int b = tv.nextInt();
        int result=a-b;
        System.out.println("subtraction of" +a+ "and" +b+ "is" + result);

    }

    public void multiplication()
    {
        System.out.println("Multiplication");
        System.out.println("Digit 1; ");
        int a = tv.nextInt();
        System.out.println("Digit 2: ");
        int b = tv.nextInt();
        int result= a*b;
        System.out.println("Multiplication of "+a+ "and" +b+ "is" +result);

    }

    public void division()
    {
        System.out.println("Division");
        System.out.println("Digit 1; ");
        int a = tv.nextInt();
        System.out.println("Digit 2: ");
        int b = tv.nextInt();
        int result= a/b;
        System.out.println("Division of "+a+ "and" +b+ "is" +result);
    }
}
