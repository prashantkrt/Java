package OOPS.Lecture1_Encapsulation;
// binding of the data and methods together is called encapsulation
// methods are working with the data here this is called encapsulation
public class Student {
    private int id;
    private String name;
    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
