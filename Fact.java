import java.util.Scanner;

public class Fact {
    public static void main(String... args) {
        int a;
        Fact obj = new Fact();
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.close();
        int n = obj.Factorial(a);
        System.out.println("Factorial of " + a + " is " + n);
    }

    int Factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++)
            fact = fact * i;
        return fact;
    }

}
