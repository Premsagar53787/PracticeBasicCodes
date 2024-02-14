import java.util.Scanner;

public class Revnum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        //int num = 2341;
        int rev = 0, rem, temp;
        temp = num;
        while(num!=0){
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num/10;
        }  
        System.out.println(temp+" reverse is "+rev);
        if(temp == rev) System.out.println("The number is a palindrome");
        else System.out.println("The number is not a palindrome");
    }
}