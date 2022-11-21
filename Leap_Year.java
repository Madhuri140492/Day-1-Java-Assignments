// Write a Java Program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

package Day1_PracticeProblem;

import java.util.Scanner;
public class Leap_Year // Declaring a Class
{
    public static void main(String args[]) // Main Method
    {
        int year; // Initializing Variable
        Scanner scanner = new Scanner(System.in); // Creating an Object
        System.out.println("Enter a Year :"); // Print the Input
        year = scanner.nextInt(); // To read Input From Console

        if ((year%400==0) || (year%4 ==0 && year%100 !=0)) // Condition && Used For Condition True, || Used to Separate the Condition
        {
            System.out.println("It is a Leap Year.");
        }
        else {
            System.out.println("It is Not a Leap Year.");
        }
    }
}


