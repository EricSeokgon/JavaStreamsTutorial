package Stream_Grouping;

import stream_operations.Employee;

import java.util.Map;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        Map personsByGenderAndDobMonth
                = Employee.persons()
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.groupingBy(p -> p.getDob().getMonth(),
                                Collectors.mapping(Employee::getName, Collectors.joining(", ")))));

        System.out.println(personsByGenderAndDobMonth);
    }
}
