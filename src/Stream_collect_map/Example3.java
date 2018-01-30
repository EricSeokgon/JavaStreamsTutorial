package Stream_collect_map;

import Stream_Collections.Employee;

import java.util.Map;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        Map<Employee.Gender, Long> countByGender  = Employee.persons()
                .stream()
                .collect(Collectors.toMap(Employee::getGender, p  ->  1L, (oldCount, newCount)  ->  newCount+oldCount));

        System.out.println(countByGender);
    }
}
