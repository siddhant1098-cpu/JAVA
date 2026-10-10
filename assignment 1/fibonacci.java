import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int i = 2;
        System.out.println(a);
        System.out.println(b);
        while(i<=n){
            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;

        }
    }
}
