import java.util.*;

public class Even_Odd {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        sc.close();
        Even_Odd obj = new Even_Odd();
        obj.check(n);
    }

    void check(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else if (n % 2 != 0)
            System.out.println("Odd");
        else
            System.out.println("Invalid Input");
    }
}