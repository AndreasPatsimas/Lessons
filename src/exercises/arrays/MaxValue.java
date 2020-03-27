package exercises.arrays;

import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args) {

        double[] decMax = {-2.8, -8.8, 2.3, 7.9, 4.1, -1.4, 11.3, 10.4,
                8.9, 8.1, 5.8, 5.9, 7.8, 4.9, 5.7, -0.9, -0.4, 7.3, 8.3, 6.5, 9.2,
                3.5, 3, 1.1, 6.5, 5.1, -1.2, -5.1, 2, 5.2, 2.1};

        double max = decMax[0];

        for (int counter = 1; counter < decMax.length; counter++)
        {
            if (decMax[counter] > max)
            {
                max = decMax[counter];
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}
