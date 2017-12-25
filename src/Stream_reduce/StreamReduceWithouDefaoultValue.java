package Stream_reduce;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduceWithouDefaoultValue {
    public static void main(String[] args) {
        Optional<Integer> max = Stream.of(1, 2, 3, 4, 5).reduce(Integer::max);

        if (max.isPresent()) {
            System.out.println("max = " + max.get());
        } else {
            System.out.println("max is not  defined.");
        }

        max = Stream.<Integer>empty().reduce(Integer::max);
        if (max.isPresent()) {
            System.out.println("max = " + max.get());
        } else {
            System.out.println("max is not  defined.");
        }
    }
}
