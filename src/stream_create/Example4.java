package stream_create;

import java.util.stream.Stream;

/**
 * Created by hadeslee on 2017-10-15.
 */
public class Example4 {
    public static void main(String[] args) {
        Stream.generate(Example4::next)
                .limit(5)
                .forEach(System.out::println);
    }
    static int i=0;
    private static int next(){
        i++;
        return i;
    }
}
