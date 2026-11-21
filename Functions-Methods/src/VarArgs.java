import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //multiple(2, 3, "Hi Lol");
        //fun(67);
        //fun("Siddhant Salunkhe");
        System.out.println(sum(8, 9));
        System.out.println(sum(2, 3, 9));
        demo(67);
        demo("Siddhu", "Omie", "Ishu" );
    }

    static void multiple(int a, int b, String ...d){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(d));
    }

    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }


    static void fun(String name){
        System.out.println(name);
    }

    static void fun(int a){
        System.out.println(a);
    }
}
