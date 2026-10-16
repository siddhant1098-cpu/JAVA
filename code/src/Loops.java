import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //Q. print numbers from 1 to 5
        //for (int i=1; i<=5; i++){
        //    System.out.println(i);
        //}

        //Q. print numbers from 1 to n
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i + "*");

        }
    }
}


