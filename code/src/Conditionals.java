import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("Enter your salary (without bonus): ");
        Scanner in = new Scanner(System.in);

        int salary = in.nextInt();
        if (salary>25000){
            salary = salary + 3000;
        }
        else if(salary>15000){
            salary = salary+2000;
        }
        else{
            salary = salary+1000;
        }
        System.out.println("After adding bonus your salary is: ");
        System.out.println(salary);

    }
}