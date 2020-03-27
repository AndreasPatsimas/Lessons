package paragraphs;

public class Arrays_6 {

    public static void main(String[] args) {

//        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // array of Strings

        int[] myNum = {10, 20, 30, 40}; // array of integers

//        Access the Elements of an Array

        String carInPositionZero = cars[0];
        System.out.println(carInPositionZero);

//        Change an Array Element

        cars[0] = "Opel";
        System.out.println("Change.......");
        System.out.println(cars[0]);

//        Array Length

        int x = cars.length;
        System.out.println("Cars length: " + x);

//        Loop Through an Array

        System.out.println("Values of array car: ");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

//        Multidimensional Arrays

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int y = myNumbers[0][1];
        System.out.println("One value of Multidimensional Array");
        System.out.println(y);


        System.out.println("All values of Multidimensional Array");
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // different initialization
        int a[] = new int[5];
        String b[][] = new String [5][5];
    }
}
