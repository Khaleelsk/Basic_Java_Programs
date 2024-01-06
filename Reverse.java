import java.util.*;

public class Reverse {
    public static void main(String... args) {
        int i;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        String re = "";
        for (i = a.length() - 1; i >= 0; i--)
            re = re + a.charAt(i);
        System.out.println(re);
    }
}
