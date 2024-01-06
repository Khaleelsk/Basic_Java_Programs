import java.util.*;

class Palindrome {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        String org = s.nextLine();
        s.close();
        String or = org.toLowerCase();
        String re = "";
        int i, len;
        len = or.length();
        for (i = len - 1; i >= 0; i--)
            re = re + or.charAt(i);
        if (or.equals(re))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}