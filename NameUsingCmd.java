// Write a Java Program To get the name using the command line.

package Day1_PracticeProblem;

import java.util.Scanner;


public class NameUsingCmd // Class Declaration
{
    public static void main (String args[]) // Main Method
    {
        System.out.println("Enter a String :"); // To Print the String
        Scanner scanner = new Scanner(System.in); // Creating Object of scanner class to take input from User.
        String inputString = scanner.nextLine(); // To read the Input (Value)
        System.out.println("String Read From Console is :"+ inputString);
    }
}
