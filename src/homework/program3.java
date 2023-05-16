package homework;

public class program3 {

    /**
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme.
     */

    int a = 15;
    static int b = 25;

    public static void main(String[] args) {
    program3 obj1 = new program3();
    obj1.myName();
    twinkle();

    }
    public void myName()//instance method
    {
        System.out.println(a);
    }

    public static void twinkle()//static method
    {
        System.out.println(b);
    }

}
