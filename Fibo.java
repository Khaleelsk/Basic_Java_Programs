import java.util.*;

public class Fibo {
    public static void main(String... agrs) {
        int a1 = 0, a2 = 1, a3, n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        System.out.print(a1 + " " + a2 + " ");
        for (i = 2; i < n; ++i) {
            a3 = a1 + a2;
            System.out.print(a3 + " ");
            a1 = a2;
            a2 = a3;
        }
    }
}