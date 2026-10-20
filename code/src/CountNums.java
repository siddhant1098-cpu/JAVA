import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();
        System.out.print("Enter the number to be counted: ");
        int n = in.nextInt();

        int count = 0;
        System.out.print("The total occurences of "+num+" is: ");
        while (num>0){
            int rem = num%10;
            if (rem==n){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);


    }
}
