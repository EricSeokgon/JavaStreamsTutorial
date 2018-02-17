package stream_partition;

import stream_operations.Employee;

import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        Map<Boolean, String> partionedByMaleGender = Employee.persons()
                .stream()
                .collect(Collectors.partitioningBy(Employee::isMale,
                        Collectors.mapping(Employee::getName, Collectors.joining(", "))));
        System.out.println(partionedByMaleGender);
    }
}
