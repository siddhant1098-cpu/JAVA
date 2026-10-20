import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from user till user does not press X or x
        System.out.print("Enter the desired operator: ");


        while (true){
            //take the operator as input
            char op = in.next().trim().charAt(0);
            if (op == 'x' || op == 'X'){
                break;
            }
            else if (op =='+' || op == '-' || op=='*' || op=='/'){
                System.out.print("Enter first number: ");
                int a = in.nextInt();
                System.out.print("Enter second number: ");
                int b = in.nextInt();

                if (op == '+') {

                    int sum = a + b;
                    System.out.println("The sum is: " + sum);
                }
                if (op == '-') {
                    int diff = a-b;
                    System.out.println("The difference is: " + diff);
                }
                if (op == '*') {
                    int mul = a*b;
                    System.out.println("The product is: " + mul);
                }
                if (op == '/') {
                    if(b!=0) {
                        int div = a / b;
                        System.out.println("The division is: " + div);
                    }
                    else{
                        System.out.println("Invalid Input");
                    }
                }

            }
            else{
                System.out.println("Invalid Input");
            }
        }
    }
}
