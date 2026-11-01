 import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        System.out.println(greet());
    }
    static String greet(){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        return name;
    }
}
