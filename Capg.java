public class Capg {
	public static String reverseWord(String inputString){
		String words[] = inputString.split(" ");
		StringBuilder reversed = new StringBuilder();

		for(int i = words.length - 1; i>=0 ; i--){
			reversed.append(words[i]);
			if(i != 0){
				reversed.append(" ");
			}
	}
		return reversed.toString();
	}
	public static void main(String[] args){
		String s1 = "This is my first program";
		String output = reverseWord(s1);
		System.out.println(output);
	}
}
