package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {

        Object[][] myArray = { {1, 2, "ef3", 4.5}, {5, 6, 7, "fd"} };

        for (int i = 0; i < myArray.length; ++i) {
            for(int j = 0; j < myArray[i].length; ++j) {
                System.out.println(myArray[i][j]);
            }
        }

        List collection = Arrays.stream(myArray)  //'array' is two-dimensional
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        //List myList = twoDArrayToList(myArray);

        System.out.println(collection);
    }

    private static  <T> List<T> twoDArrayToList(T[][] twoDArray) {
        List<T> list = new ArrayList<T>();
        for (T[] array : twoDArray) {
            list.addAll(Arrays.asList(array));
        }
        return list;
    }
}
