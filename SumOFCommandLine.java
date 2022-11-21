// Write a Java Program To find the sum of command-line arguments .

package Day1_PracticeProblem;

import java.util.Scanner;

public class SumOFCommandLine
{
    public static void main(String[] args) {
        int num1, num2, sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        num1 = sc.nextInt();
        System.out.println("Enter the Second Number :");
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println("Sum Of Two Numbers : " + sum);

    }
}
