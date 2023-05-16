package homework;
/**
 * Write a Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */

import java.util.Scanner;
public class program17 {


        public static void main(String[] args) {

            Scanner tv = new Scanner(System.in);
            System.out.println("input a decimal number");
            int de = 5;
            String b = Integer.toBinaryString(de);
            System.out.println("Binary number is:" + b);

            int a = tv.nextInt();






        }
    }

