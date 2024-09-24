public class Mph {
    public static void main(String[] args) {
        String s = "aabbcccdddd";
        StringBuilder s2 = new StringBuilder();
        int count = 1; 
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++; 
            } else {
                s2.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        s2.append(s.charAt(s.length() - 1)).append(count);
        System.out.println(s2.toString());
    }
}
