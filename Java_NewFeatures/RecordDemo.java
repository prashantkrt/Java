package Java_NewFeatures;

//class Student {
//
//    private int id;
//    private String name;
//    private String address;
//    private String email;
//    private String phone;
//    private String city;
//
//    public Student() {
//
//    }
//
//    public Student(int id, String name, String address, String email, String phone, String city) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        this.email = email;
//        this.phone = phone;
//        this.city = city;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//
//    public String getAddress() {
//        return address;
//    }
//
//
//    public String getEmail() {
//        return email;
//    }
//
//
//    public String getPhone() {
//        return phone;
//    }
//
//
//    public String getCity() {
//        return city;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", email='" + email + '\'' +
//                ", phone='" + phone + '\'' +
//                ", city='" + city + '\'' +
//                '}';
//    }
//}

// got all the above thing with getter not setter
record Student(int id, String name, String address, String email, String phone, String city) {

}


public class RecordDemo {
    public static void main(String[] args) {

        Student st = new Student(12, "Rishu", "BNMCity 78B", "kodarma@gogo.mo", "67890432", "BNMCity");
        System.out.println(st.address());
        System.out.println(st.phone());
        System.out.println(st.id());
        System.out.println(st.email());

        System.out.println(st);
    }
}

