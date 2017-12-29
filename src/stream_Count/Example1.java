package stream_Count;

import stream_operations.Employee;

public class Example1 {
    public static void main(String[] args) {
        long personCount = Employee.persons().stream().count();
        System.out.println("Person count: " + personCount);
    }
}
