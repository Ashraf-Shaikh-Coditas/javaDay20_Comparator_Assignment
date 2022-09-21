package Week6.Day20.Assignments.Employee;

import java.util.Comparator;

public class SalaryGreaterThan15000 implements Comparator<Employee> {

    @Override
    public int compare(Employee o1,Employee o2) {
        if(o1.salary > 15000)
            return 1;
        return -1;
    }



}
