package Stream_String;

/**
 * Created by hadeslee on 2017-11-04.
 */
public class Example {
    public static void main(String[] args) {
        String str = "5 123,123,qwe,1,123, 25";
        str.chars()
                .filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
                .forEach(n -> System.out.print((char) n));

    }
}
