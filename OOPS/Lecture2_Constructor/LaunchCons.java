package OOPS.Lecture2_Constructor;

class Employee {
    private int id;
    private String name;
    private int age;

    Employee(int id, String name, int age) {
        //super(); behind the scene this super is there
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Id :" + id);
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
}

public class LaunchCons {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Rohan", 18);
        emp.display();
    }
}