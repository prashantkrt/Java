package collection.class4.LaunchComplexSortingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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

//comparator is a functional Interface
// it has compare method only

/*
 * logic of sorting:-
 * if age of emp1 > age of emp2 then swap the employee : ascending order
 * +ve number means swap
 * -ve number means not swap
 * */
class Alpha implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge()>o2.getAge()) //swap
            return 1;
        else
            return -1; // not swap
    }
//    shortcut
//    public int compare(Employee o1, Employee o2) {
//        return o1.getAge()-o2.getAge();
//    }
}

public class LaunchComplexSorting {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Rakesh", 15);
        Employee emp2 = new Employee(2, "Mukesh", 25);
        Employee emp3 = new Employee(3, "Rohan", 35);
        Employee emp4 = new Employee(4, "Ramesh", 23);
        Employee emp5 = new Employee(5, "Sagar", 13);

        List<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        System.out.println(list);

        for (Employee e : list)
            System.out.println(e);

        Alpha a = new Alpha();
        Collections.sort(list,a);

        System.out.println(list);
    }
}
