package homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class program19 {

    public static void main(String[] args)
    {
       twinkle();
    }
    public static Scanner tv = new Scanner(System.in);
    public static void twinkle(){

        System.out.print("Input a String: ");
        String line = tv.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }

}
