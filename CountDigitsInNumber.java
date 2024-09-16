public class CountDigitsInNumber {
	
	public static void main(String[] args) {
		int digit = 12345;
		int count = 0;
		
		if (digit == 0) {
            count = 1;
        } else {
            int temp = digit; // Handle negative numbers
            while (temp > 0) {
                temp /= 10; // Remove the last digit
                count++;    // Increment the digit count
            }
        }
        
        System.out.println(count);
    }
}
