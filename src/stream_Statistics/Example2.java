package stream_Statistics;

import stream_operations.Employee;

import java.util.DoubleSummaryStatistics;

public class Example2 {
    public static void main(String[] args) {
        DoubleSummaryStatistics incomeStats = Employee.persons()
                .stream()
                .map(Employee::getIncome)
                .collect(DoubleSummaryStatistics::new,
                        DoubleSummaryStatistics::accept,
                        DoubleSummaryStatistics::combine);
        System.out.println(incomeStats);
    }
}
