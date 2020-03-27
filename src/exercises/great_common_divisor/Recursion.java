package exercises.great_common_divisor;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give first number...");

        int n1 = scanner.nextInt();

        System.out.println("Give second number...");

        int n2 = scanner.nextInt();

        int result = gcdByRecursion(n1, n2);

        System.out.println("Calculating Great Common Divisor...");

        System.out.println(result);
    }

    private static int gcdByRecursion(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByRecursion(n2, n1 % n2);
    }
}
