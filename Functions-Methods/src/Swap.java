public class Swap {

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " + a + " " + b );

        String name = "Siddhant Salunkhe";
        System.out.println(changeName (name));
    }
    static String changeName(String name){
        name = "Om Satale";
        return name;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: " + a + " " + b);
        swap(a, b);

    }

}
