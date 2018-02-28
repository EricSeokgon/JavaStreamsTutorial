package Parallel_Streams;

import stream_operations.Employee;

import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        String names = Employee.persons()
                .stream()
                .filter(Employee::isMale)
                .map(Employee::getName)
                .collect(Collectors.joining(", "));
        System.out.println(names);

        names = Employee.persons()
                .parallelStream()
                .filter(Employee::isMale)
                .map(Employee::getName)
                .collect(Collectors.joining(", "));
        System.out.println(names);

    }
}
