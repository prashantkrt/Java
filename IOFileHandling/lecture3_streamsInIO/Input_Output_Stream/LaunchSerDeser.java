package IOFileHandling.lecture3_streamsInIO.Input_Output_Stream;

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
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Prakash", 23);
        Employee employee2 = new Employee(2, "Dheeraj", 33);
        Employee employee3 = new Employee(3, "Ravi", 27);

        employee1.display();
        FileOutputStream fos = null;
        BufferedOutputStream bos = null; // makes faster
        ObjectOutputStream oos = null;

        FileInputStream fis = null;
        BufferedInputStream bis = null; // makes faster , lesser hits to HD
        ObjectInputStream ois = null;

        String path = "/Users/prashantkumartiwary/Documents/FileHandling/stream.txt";
        try {

            //streams in IO
            //it will not store in terms of directly or raw data , it will concert to bytes
            //it will crush the object to bytes
            //This is called serialization

            // file me bhejna or likhna jaake
            fos = new FileOutputStream(path);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);
            oos.writeObject(employee1);

            fos.flush();
            bos.flush();
            oos.flush();

            //file se uthana ya read karna file se
            fis = new FileInputStream(path);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);

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
                if (fos != null) {
                    fos.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (fis != null) {
                    fis.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.out.println("Exception occurred w.r.t IOException");
            }
        }
    }
}
