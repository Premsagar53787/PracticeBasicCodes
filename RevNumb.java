public class RevNumb {
    public static void main(String[] args) {
        int number = 121, reverse = 0; 
        int remainder, temp; 
        temp = number;
        while(number != 0){  
            remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10; 
        }
        System.out.println("The reverse of the given number is: " + reverse);
        if (temp == reverse) {
            System.out.println("is a palindrome number");
        } else {    
            System.out.println(" is not a palindrome number");
        }
    
        String str= "prem", nstr="";
        char ch;
        System.out.print("Original word: ");
        System.out.println("Prem"); //Example word
        for (int i=0; i<str.length(); i++){
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}