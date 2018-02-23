package Streams_Converter;

import Stream_Collections.Employee;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<String> names = Employee.persons()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        result -> Collections.unmodifiableList(result)));
        System.out.println(names);
    }
}
