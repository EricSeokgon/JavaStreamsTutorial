package stream_Statistics;

import stream_operations.Employee;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        DoubleSummaryStatistics incomeStats = Employee.persons()
                .stream()
                .collect(Collectors.summarizingDouble(Employee::getIncome));
        System.out.println(incomeStats);
    }
}
