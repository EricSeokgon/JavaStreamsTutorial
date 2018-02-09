package Stream_Grouping;

import Stream_Collections.Employee;

import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        Map<Employee.Gender, String> namesByGender = Employee.persons()
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.mapping(Employee::getName, Collectors.joining(", "))));
        System.out.println(namesByGender);
    }
}
