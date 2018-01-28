package Stream_collect_map;

import Stream_Collections.Employee;

import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        Map<Employee.Gender,String> genderToNamesMap  =
                Employee.persons()
                        .stream()
                        .collect(Collectors.toMap(Employee::getGender,
                                Employee::getName,
                                (oldValue, newValue)  ->  String.join(", ", oldValue,  newValue)));
        System.out.println(genderToNamesMap);
    }
}
