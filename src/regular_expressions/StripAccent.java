package regular_expressions;

import java.text.Normalizer;

public class StripAccent {

    public static void main(String ...args){

        System.out.println("ω".equals("ώ"));
        System.out.println("ω".equals(stripAccents("ώ")));
    }

    private static String stripAccents(String input){

        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);

        String accentRemoved = normalized.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

        return accentRemoved;
    }
}
