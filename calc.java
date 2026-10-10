import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();

        System.out.println("Enter you choice of operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int c = in.nextInt();

        if(c == 1){
            int add = a+b;
            System.out.println("The sum of the two numbers is " + add);
        }
        else if (c==2) {
            int sub = a-b;
            System.out.println("The subtraction of the two numbers is " + sub);
        }
        else if(c==3){
            int mul = a*b;
            System.out.println("The multiplication of the two numbers is " + mul);
        }
        else if (c==4) {
            int div = a/b;
            System.out.println("The division of the first number with the second is " + div);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
