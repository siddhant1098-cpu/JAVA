import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int P = in.nextInt();
        float R = in.nextFloat();
        int N = in.nextInt();

        float Si = (P*R*N)/100;
        System.out.println("the simple ineterest on the given priciple amount is " + Si);

    }
}
