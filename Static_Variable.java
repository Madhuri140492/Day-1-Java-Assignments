// Write a Java Program to demonstrate static variables, methods, and blocks

package Day1_PracticeProblem;

public class Static_Variable  // Declaring a Class
{
    static int a = 10; // Declaration of Static Variable
    static int b = 20; // Declaration of Static Variable

    static void Multiply(int a, int b) // Declaring a Static Method
    {

        System.out.println("Multiplication of a and b are : " + (a * b));
    }
    public static int Substract(int a, int b, int c)
    {
        int substract;
        return substract = a - b - c;
        // method can return only one value with return statement not two and we can
        // not return two values because after returning it goes to the main method
    }
    static // Declaring Static Block
    {
        System.out.println("Initialising static block"); // static block executed first because JVM know static block
        // only and start executing each of them are executed in the order of their declaration.
        a = 15;
    }

    public static void main(String[] args) {
        int c;
        System.out.println("Sum of Static variable calling direct is " + (a + b));
        Multiply(a = 20, b = 30);
        int value = Substract(a = 50, b = 30, c = 60);
        System.out.println("Subtraction of variables are " + value);
        System.out.println("Subtraction of variables are " + Substract(a = 110, b = 30, c = 60));
    }
}


