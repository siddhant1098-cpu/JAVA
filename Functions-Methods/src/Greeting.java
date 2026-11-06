import java.util.Scanner;

public class Greeting
{

    public static void main(String[] args) {
        //greet("Siddhant");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        greet(name);

    }
    static void greet (String name){
        System.out.println("Hello "+ name);
    }
}
