package Optional;

import java.util.Optional;

/**
 * Created by hadeslee on 2017-09-13.
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> str = Optional.of("hadeslee.tistory.com");
        System.out.println(str);

        String nullableString = "";
        Optional<String> str2 = Optional.of(nullableString);
        System.out.println(str2);
    }
}
