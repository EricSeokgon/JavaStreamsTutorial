package stream_partition;

import stream_operations.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        Map<Boolean, List<Employee>> partionedByMaleGender =
                Employee.persons()
                        .stream()
                        .collect(Collectors.partitioningBy(Employee::isMale));
        System.out.println(partionedByMaleGender);
    }
}
