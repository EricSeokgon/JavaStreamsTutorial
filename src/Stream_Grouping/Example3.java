package Stream_Grouping;


import stream_operations.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        Map<Employee.Gender, List<String>> namesByGender =
                Employee.persons()
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getGender,
                                Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(namesByGender);
    }
}
