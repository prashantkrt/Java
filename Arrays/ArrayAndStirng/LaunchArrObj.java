package Arrays.ArrayAndStirng;

class Student {
    String name;
    int age;
    double marks;

    public void display() {
        System.out.println("The Name is " + name);
        System.out.println("The age is " + age);
        System.out.println("The marks is " + marks);
        System.out.println();
    }
 //this method actually print the address, but we override the method and added our own logic
    public String toString() {
        return "Name :" + name + " Age :" + age + " marks :" + marks;
    }
}

public class LaunchArrObj {
    public static void main(String[] args) {
        Student[] stdArr = new Student[5];
        stdArr[0] = new Student();
        stdArr[1] = new Student();
        stdArr[2] = new Student();
        stdArr[3] = new Student();
        stdArr[4] = new Student();

        stdArr[0].name = "Prashant";
        stdArr[0].age = 26;
        stdArr[0].marks = 80;

        stdArr[1].name = "Krishna";
        stdArr[1].age = 24;
        stdArr[1].marks = 90;

        stdArr[2].name = "Pradeep";
        stdArr[2].age = 28;
        stdArr[2].marks = 60;

        stdArr[3].name = "Prakash";
        stdArr[3].age = 26;
        stdArr[3].marks = 67;

        stdArr[4].name = "Akash";
        stdArr[4].age = 27;
        stdArr[4].marks = 59;


        for (Student str : stdArr)
            str.display();

        for (Student str : stdArr)
            System.out.println(str);
    }

}
