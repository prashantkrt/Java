package OOPS.Lecture1_Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(121);
        s1.setName("Baka");
        s1.setMarks(99);
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());

        Student s2 = new Student();
        s1.setId(122);
        s1.setName("Kaka");
        s1.setMarks(69);
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());

    }
}
