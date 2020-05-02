package functions;

import java.util.*;

public class MyFunctions {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("John", "Jane", "Jack", "Dennis"));

        List<Integer> ages = new ArrayList<>(Arrays.asList(24, 25, 27, 28));

        List<String> emails = new ArrayList<>(Arrays.asList("john@gmail.com", "jane@gmail.com", "jack@gmail.com",
                "dennis@gmail.com"));

        List list = zip(names, ages, emails);

        System.out.println(list);
    }

    private static <T> List<List<T>> zip(List... lists) {

        List<List<T>> zipped = new ArrayList<>();

        for (List<T> list : lists) {

            for (int i = 0, listSize = list.size(); i < listSize; i++) {

                List<T> list2;

                if (i >= zipped.size())
                    zipped.add(list2 = new ArrayList<>());
                else
                    list2 = zipped.get(i);

                list2.add(list.get(i));
            }
        }
        return zipped;
    }
}
