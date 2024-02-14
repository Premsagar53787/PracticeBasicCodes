public class Prac1 {
    public static void main(String[] args) {
        int n = 10;
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci sequence up to the " + n + "th number: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}