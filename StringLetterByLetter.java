public class StringLetterByLetter {
    public static void main(String[] args) {
        String s = "Prem sagar", revstr = "";
        String s1 = "ABC";
        String s2 = "XYZ";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        String s3 = s1.concat(s2);
        System.out.println(s3);
     
        System.out.println("Origin Word " + s);
        for (int j = 0; j < s.length(); j++) {
            ch = s.charAt(j);
            revstr = ch+revstr;
        }
        System.out.println("Reversed word: " + revstr);
            }
    }

