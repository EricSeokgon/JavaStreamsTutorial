package Stream_Grouping;

import stream_operations.Employee;

import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Map<Employee.Gender, Long> countByGender = Employee.persons()
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countByGender);
    }
}
