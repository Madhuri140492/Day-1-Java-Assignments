//Write a Java program to check if two strings are Equal or Not.


package Day1_PracticeProblem;
import java.util.Scanner;
public class TwoStringsEqualOrNot // Class Name
{
    public static void main (String args[]) // Main Method
    {
        String str1, str2; // Sting type Variable Declaration
        Scanner scanner = new Scanner(System.in); // To take Input From User and creating Object of Scanner Class

        System.out.println("Enter the First String : ");
        str1 = scanner.nextLine(); // Read the String Value

        System.out.println("Enter the Second String : ");
        str2 = scanner.nextLine(); // Read the String Value

        if (str1.equals(str2)) // Condition
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are Unequal");
    }
}