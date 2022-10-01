import java.util.Locale;

public class ValidateString {

    public static void main(String[] args) {

        String nature = null;
        boolean isNull = nature == null;

        System.out.println("isNull = " + isNull);

        if(isNull) {
            nature =" "; // "Tree"
        }

        boolean isNull2 = nature.length() == 0;
        System.out.println("isNull2 = " + isNull2);

        boolean isNull3 = nature.isEmpty();
        System.out.println("isNull3 = " + isNull3);

        boolean isNull4 = nature.isBlank();
        System.out.println("isNull4 = " + isNull4);

        /*
        Two methods are presented to validate strings; the strictest is isBlanck()
        because it validates even whitespace as well as if the string is null.
         */

        if(!nature.isBlank()) {
            System.out.println(nature.toUpperCase());
            System.out.println("This is ".concat(nature) );
        }

    }
}
