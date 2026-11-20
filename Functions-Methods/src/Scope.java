public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kunal";
        {
//            int a = 78; // already initialised outside the block in the same method, hence you cannot initialize it again
            a = 100; //but you can reassign the origin ref variable to some other value
            System.out.println(a);
            int  c = 99;
            name = "Siddhant";
            System.out.println(name);
            //values initialized in this block, will remain in block
        }
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c); //cannot use outside the block

        //scoping in for loops
        for (int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;

        }
        //System.out.println( i);
        //System.out.println(num);
    }


    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
