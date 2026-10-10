import java.util.Scanner;

public class largestoftwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        if (a>b){
            System.out.println(a+ " is greater than " + b);
        }
        else if(b>a){
            System.out.println(b+ " is greater than " + a);
        }
        else{
            System.out.println("Both numbers are equal");
        }

    }
}
