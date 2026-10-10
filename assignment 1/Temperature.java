import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Temperature in C: ");
        float c = in.nextFloat();
        double f = (c*1.8)+32;
        System.out.println("The temperature in F is: " + f);
    }
}
