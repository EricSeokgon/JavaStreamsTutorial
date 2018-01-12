package Stream_Collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        SortedSet<String> uniqueSortedNames=   Employee.persons()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(uniqueSortedNames);
        System.out.println(uniqueSortedNames);
    }
}
