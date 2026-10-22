import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department=  in.next();

        switch (empID) {
            case 1 -> System.out.println("Siddhant Salunkhe");
            case 2 -> System.out.println("Om Satale");
            case 3 -> {
                switch (department) {
                    case "management" -> System.out.println("Ishant Dhale");
                    case "CEO" -> System.out.println("Om Shinde");
                    default -> System.out.println("Siddhant Salunkhe");
                }
            }
            default -> System.out.println("Enter valid Employee ID");
        }
    }
}
