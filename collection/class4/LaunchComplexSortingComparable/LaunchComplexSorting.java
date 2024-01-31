package collection.class4.LaunchComplexSortingComparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
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

    @Override
    public int compareTo(Employee o) {
//        if(this.age>o.age)
//            return 1; // swap
//        else return -1;//not swap
        return this.age-o.age;
    }
}

public class LaunchComplexSorting {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Rakesh", 15);
        Employee emp2 = new Employee(2, "Mukesh", 25);
        Employee emp3 = new Employee(3, "Rohan", 35);
        Employee emp4 = new Employee(4, "Ramesh", 23);
        Employee emp5 = new Employee(5, "Sagar", 13);

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        System.out.println(list);

        for (Employee e : list)
            System.out.println(e);

        Collections.sort(list);
        System.out.println(list);
    }
}

/*
*                   Comparable v/s comparator
* 1.) ask to implement compareTo method and pass only one object ****
* where as Comparator expects us to implement compare method with two object as parameter or argument
*
* 2.) for comparable target class needs to be accessible and modifiable as we directly implement compareTo() method in that class
* whereas Comparator doesn't need the access of target class, as we can implement at the time of sorting
*
* */
