package StreamAPI.part2;

import java.util.Arrays;
import java.util.List;


class Student {
    private int marks;
    private String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}

public class MethodRefEX2 {
    public static void main(String[] args) {

        List<Student> student = Arrays.asList(new Student(10, "Rakesh"),
                new Student(20, "Prakash"),
                new Student(30, "Vijay"));

        List<String> myName = student.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .toList();

        System.out.println(myName);


        //find the highest marks using the stream
        Student s = student.stream()
                .reduce( (s1,s2)->s1.getMarks()>s2.getMarks() ? s1 : s2)
                .get();

        System.out.println(s);
    }
}
