package exercises.palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int reversedInteger = 0, remainder, originalInteger;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give number to check if exercises.palindrome or not:");

        int num = scanner.nextInt();

        originalInteger = num;
        // reversed integer is stored in variable
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        // exercises.palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a exercises.palindrome.");
        else
            System.out.println(originalInteger + " is not a exercises.palindrome.");
    }
}