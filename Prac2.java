public class Prac2 {
    public static int Fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int range = 10;
        System.out.print("Fibonacci Series of " + range + " numbers is: ");
        for(int i = 0 ; i < range;i ++){
            System.out.print(Fibonacci(i) + " ");
        }
    }
}
