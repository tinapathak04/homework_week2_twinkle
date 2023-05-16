package homework;

public class program4
{

    /**
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
     */

   int a = 5;
   int b = 10;

   static int c = 15;
   static int d = 20;

    public static void main(String[] args) {
        program4 obj = new program4();
        obj.myName();
        twinkle();
    }

    public void myName()//instance method
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void twinkle()//static method
    {program4 obj1 = new program4();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(c);
        System.out.println(d);
    }


}
