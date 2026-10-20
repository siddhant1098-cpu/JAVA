import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;
        int c = 0;

        while(count<=n){
            c = a+b;
            a = b;
            b = c;
            count++;
        }
        System.out.println(c);
    }
}
