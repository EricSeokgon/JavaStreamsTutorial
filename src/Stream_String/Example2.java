package Stream_String;

import java.util.regex.Pattern;

/**
 * Created by hadeslee on 2017-11-05.
 */
public class Example2 {
    public static void main(String[] args) {
        String str = "XML,CSS,HTML";
        Pattern.compile(",")
                .splitAsStream(str)
                .forEach(System.out::println);

    }
}
