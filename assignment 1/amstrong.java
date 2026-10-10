import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the start of range: ");
        int a = in.nextInt();
        System.out.println("Enter the end of the range: ");
        int b = in.nextInt();
        for (int j = a; j<=b; j += 1){
            int n = j;
            String s = String.valueOf(n);
            int m = s.length();
            int sum = 0;

            for(int i=0; i<m;i++){
                int digit = s.charAt(i) - '0';
                sum = (int) (sum + Math.pow(digit, m));
            }
            if (sum == n) {
                System.out.println(n+ " is an Amstrong number");
            }
        }
    }
}

