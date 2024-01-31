package IOFileHandling.lecture3_streamsInIO;

import java.io.*;

//Serializable is a marker interface with no methods
class Employee implements Serializable {
    //either use this id or use class while doing de-serialization
    @Serial
    private static final long serialVersionUID = 1L;
    private int Id;
    private String name;
    private int age;

    public Employee() {

    }

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

    public void display() {
        System.out.println("ID " + Id);
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }

    @Override
    public String toString() {
        return "Employee{" + "Id=" + Id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}


public class LaunchSerDeser {
    public static void main(String[] args) throws FileNotFoundException {

        Employee employee1 = new Employee(1, "Prakash", 23);
        Employee employee2 = new Employee(2, "Dheeraj", 33);
        Employee employee3 = new Employee(3, "Ravi", 27);

        employee1.display();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        String path = "/Users/prashantkumartiwary/Documents/FileHandling/stream.txt";
        try {

            //streams in IO
            //it will not store in terms of directly or raw data , it will concert to bytes
            //it will crush the object to bytes
            //This is called serialization

            // file me bhejna or likhna jaake
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(employee1);

            //file se uthana ya read karna file se
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);

            Employee emp = (Employee) ois.readObject();
            emp.display();

        } catch (FileNotFoundException e) {
            System.out.println("Exception occurred w.r.t to FileNotFoundException");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Exception occurred w.r.t to IOException");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
