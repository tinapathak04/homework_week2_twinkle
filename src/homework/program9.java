package homework;

import java.util.Scanner;
public class program9 {
   public static Scanner tv = new Scanner(System.in);
    public static void main(String[] args)
    {
        myName();
    }
  public static void myName(){

      System.out.println("ENTER ANY STRING");
            //Convert to LowerCase
      String txt= tv.nextLine();
      System.out.println(txt.toLowerCase());

        }



    }



