package Stream_Collections;

import stream_operations.Employee;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> names = Employee.persons()
                .stream()
                .map(Employee::getName)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(names);

    }
}
