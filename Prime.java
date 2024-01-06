import java.util.*;

public class Prime {
    public static void main(String... args) {
        int a, i, m, flag = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.close();
        m = a / 2;
        if (a == 0 || a == 1)
            System.out.println(a + " is Not a Prime Number");
        else {
            for (i = 2; i < m; i++) {
                if (a % i == 0) {
                    System.out.println(a + " is a Not Prime Number");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.println(a + " is a Prime Number");
    }
}
