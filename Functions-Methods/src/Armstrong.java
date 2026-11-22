public class Armstrong {
    public static void main(String[] args) {
        int n = 100;

        for (int i = 0; i < 1000; i++) {
            int temp = n;
            int sum = 0;
            while (temp>0){
                int rem = temp%10;
                sum += rem*rem*rem;
                temp = Math.floorDiv(temp, 10);
            }
            if (sum == n){
                System.out.println(n + " is a Armstrong number");
            }
            n++;
        }
    }
}

