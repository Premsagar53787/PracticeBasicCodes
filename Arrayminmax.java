import java.util.Arrays;

public class Arrayminmax {
    public static void main(String args[]) { 
        //Method to check whether the given number is prime or not. 3/3 == 1
        int a [] = {112,32,4,67,0,9};
        System.out.println("Arrays b4 sort " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Arrays after sort "+ Arrays.toString(a));
        
        System.out.println("Min number from array is : " + a[0] + " Max number is: " + a[a.length-1] );  
    }
}