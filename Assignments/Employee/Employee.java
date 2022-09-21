package Week6.Day20.Assignments.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    int id;
    String name;
    float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(1,"Ashraf",20000));
        arrayList.add(new Employee(2,"Aman",15000));
        arrayList.add(new Employee(3,"Praveer",30000));
        arrayList.add(new Employee(4,"Sanyami",10000));
        arrayList.add(new Employee(5,"Ayushman",13000));

        System.out.println("Before :: ");
        for(Employee employee : arrayList) {
            System.out.println(employee);
        }

        System.out.println("\nAfter sorting according to name : ");
        Collections.sort(arrayList,new SortByName());
        for(Employee employee : arrayList) {
            System.out.println(employee);
        }

        System.out.println("*************SALARY GREATER THAN 15000  ************");


        arrayList.stream().filter(p -> p.salary > 15000)
                .forEach(System.out::println);
    }


}

/*

Before ::
Employee{id=1, name='Ashraf', salary=20000.0}
Employee{id=2, name='Aman', salary=15000.0}
Employee{id=3, name='Praveer', salary=30000.0}
Employee{id=4, name='Sanyami', salary=10000.0}
Employee{id=5, name='Ayushman', salary=13000.0}

After sorting according to name :
Employee{id=2, name='Aman', salary=15000.0}
Employee{id=1, name='Ashraf', salary=20000.0}
Employee{id=5, name='Ayushman', salary=13000.0}
Employee{id=3, name='Praveer', salary=30000.0}
Employee{id=4, name='Sanyami', salary=10000.0}

*************SALARY GREATER THAN 15000  ************
Employee{id=1, name='Ashraf', salary=20000.0}
Employee{id=3, name='Praveer', salary=30000.0}


* */