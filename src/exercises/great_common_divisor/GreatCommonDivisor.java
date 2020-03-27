package exercises.great_common_divisor;

import java.util.Scanner;

public class GreatCommonDivisor {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give first number...");

        int n1 = scanner.nextInt();

        System.out.println("Give second number...");

        int n2 = scanner.nextInt();

        int result = gcd(n1, n2);

        System.out.println("Calculating Great Common Divisor...");

        System.out.println(result);
    }

    private static int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
