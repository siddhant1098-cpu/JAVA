import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to be reversed: ");
        int n = in.nextInt();
        System.out.print("The reversed number is: ");

        int ans = 0;
        while (n>0){
            int rem = n%10;

            n /= 10;
            ans = ans * 10 + rem;

        }
        System.out.println(ans);
    }
}
