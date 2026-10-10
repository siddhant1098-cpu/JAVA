import java.util.Scanner;

public class inrtousd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your amount in INR: ");
        int i = in.nextInt();
        float usd = (float)(0.010*i);
        System.out.println("The amount in USD is " + usd);

    }
}