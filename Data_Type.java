//Write a Java program to display the default value of all primitive data types of Java.

package Day1_PracticeProblem;

public class Data_Type {
        static int in;
        static boolean bool;
        static char ch;
        static float flo;
        static double doub;
        static long l;
        static short s;
        static byte by;

        static void display ()  // Method for Display the Output
        {
            System.out.println("int = " + in);
            System.out.println("boolean = " + bool);
            System.out.println("char = " + ch);
            System.out.println("float = " + flo);
            System.out.println("double = " + doub);
            System.out.println("long = " + l);
            System.out.println("short = " + s);
            System.out.println("byte = " + by);
        }

        public static void main (String[]args) // Main Method
        {
            display(); // static method can be called directly without objects

        }
    }

