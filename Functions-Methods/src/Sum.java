import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       // System.out.print("The sum is: "+sum());

        int ans = sum3(66, 33);
        System.out.println(ans);
    }

    static int sum3 (int a, int b){
        int sum = a+b;
        return sum;
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();

        return (num1+num2);


    }

    /*
      return_type function_name (){
          //body
          return statement;
      }
    */
}
