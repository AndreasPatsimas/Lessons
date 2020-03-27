package testing;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {

        int [] myArray = {5, 7, 9, 14, 22, 30, 32, 33, 34, 35, 63, 64};

        for(int i = 0; i <= 67; i++){

            if (contains(myArray, i))
                System.out.println(i);
        }
    }

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
