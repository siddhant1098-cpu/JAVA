import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Q. Take input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.print("The sum of two numbers is: "+(num1+num2));
    }
}