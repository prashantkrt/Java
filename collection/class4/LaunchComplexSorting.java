package collection.class4;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int empID;
    private String name;
    private int age;

    public Employee(int empID, String name, int age) {
        super();
        this.empID = empID;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class LaunchComplexSorting {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1,"Rakesh",15);
        Employee emp2 = new Employee(1,"Mukesh",25);
        Employee emp3 = new Employee(1,"Rohan",35);

        List<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println(list);

        for(Employee e : list)
            System.out.println(e);
    }
}
