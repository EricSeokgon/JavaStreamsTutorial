package Parallel_Streams;

import Stream_Collections.Employee;

import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        String names = Employee.persons()                // The data source
                .stream()                  // Produces a  sequential  stream
                .filter(Employee::isMale)   // Processed in serial
                .parallel()               // Produces a  parallel  stream
                .map(Employee::getName)       // Processed in parallel
                .collect(Collectors.joining(", "));  // Processed in parallel
        System.out.println(names);
    }
}
