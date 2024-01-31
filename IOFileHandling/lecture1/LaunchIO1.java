package IOFileHandling.lecture1;

class Employee {
    private int Id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        super();
        Id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return Id;
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
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class LaunchIO1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Rajesh", 45);
        Employee emp2 = new Employee(2, "Karan", 35);
        Employee emp3 = new Employee(3, "Arjun", 41);
    }
}
