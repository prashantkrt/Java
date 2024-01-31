package collection.class4.LaunchComplexSortingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee2 {
    private int empID;
    private String name;
    private int age;

    public Employee2(int empID, String name, int age) {
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
        return "Employee{" + "empID=" + empID + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}

// comparator is a functional Interface
// it has compare method only

/*
 * logic of sorting:-
 * if age of emp1 > age of emp2 then swap the employee : ascending order
 * +ve number means swap
 * -ve number means not swap
 * */

//class Alpha1 implements Comparator<Employee1> {
//    @Override
//    public int compare(Employee1 o1, Employee1 o2) {
//        if (o1.getAge()>o2.getAge()) //swap
//            return 1;
//        else
//            return -1; // not swap
//    }
//}

public class LaunchComplexSorting3 {
    public static void main(String[] args) {

        Employee2 emp1 = new Employee2(1, "Rakesh", 15);
        Employee2 emp2 = new Employee2(2, "Mukesh", 25);
        Employee2 emp3 = new Employee2(3, "Rohan", 35);
        Employee2 emp4 = new Employee2(4, "Ramesh", 23);
        Employee2 emp5 = new Employee2(5, "Sagar", 13);

        List<Employee2> list = new ArrayList<Employee2>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        System.out.println(list);

        for (Employee2 e : list)
            System.out.println(e);

        // Using anonymous inner class
//        Comparator<Employee2> obj = new Comparator<>() {
//            @Override
//            public int compare(Employee2 o1, Employee2 o2) {
//                if (o1.getAge() > o2.getAge()) // swap
//                    return 1;
//                else return -1; // not swap
//            }
//        };

        //Using lambda expression
        Comparator<Employee2> obj = (o1, o2) -> {
            return o1.getAge() - o2.getAge();
        };
        Collections.sort(list, obj);
        System.out.println(list);


        // more used :
        Collections.sort(list, (o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });
    }
}



