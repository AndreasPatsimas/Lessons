package exercises.factorial;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Calculate exercises.factorial of given number");

        n = scanner.nextInt();

        System.out.println("Calculating...");

        long result = factorialUsingRecursion(n);

        System.out.println(result);


    }

    public static long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }
}
