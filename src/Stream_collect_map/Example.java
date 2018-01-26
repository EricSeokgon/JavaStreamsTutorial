package Stream_collect_map;

import stream_operations.Employee;

import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Map<Long,String> idToNameMap  = Employee.persons()
                .stream()
                .collect(Collectors.toMap(Employee::getId,  Employee::getName));
        System.out.println(idToNameMap);
    }
}
