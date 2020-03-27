package exercises.factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args)  {

        calculateFactorial();
    }

    private static void calculateFactorial(){

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Calculate exercises.factorial of given number");

        n = scanner.nextInt();

        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Calculating...");

        System.out.println(fact);
    }

    public static void calculateFactorialWithRecursion(){

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Calculate exercises.factorial of given number");

        n = scanner.nextInt();

        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Calculating...");

        System.out.println(fact);
    }

}
