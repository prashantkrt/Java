package collection.maps;

import java.util.*;

class IdentityCard {
    private Integer age;
    private String name;
    private String city;

    IdentityCard(Integer age, String name, String city) {
        super();
        this.age = age;
        this.name = name;
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }


    public String getName() {
        return name;
    }


    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "IdentityCard{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class LaunchMap3 {
    public static void main(String[] args) {
        IdentityCard iCard1 = new IdentityCard(12, "Rohan", "Bangalore");
        IdentityCard iCard2 = new IdentityCard(13, "Sagar", "Jaipur");
        IdentityCard iCard3 = new IdentityCard(12, "Sanjay", "Jamshedpur");
        IdentityCard iCard4 = new IdentityCard(14, "Vijay", "Delhi");
        IdentityCard iCard5 = new IdentityCard(14, "Bharat", "Dehradun");

        HashMap<Integer, IdentityCard> map = new HashMap<>();

        map.put(1, iCard1);
        map.put(2, iCard2);
        map.put(3, iCard3);
        map.put(4, iCard4);
        map.put(5, iCard5);

        Set<Map.Entry<Integer, IdentityCard>> entry = map.entrySet();

        System.out.println("Welcome to information center");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the identity");
        Integer id = sc.nextInt();

        for (Map.Entry<Integer, IdentityCard> entires : entry) {
            if (Objects.equals(entires.getKey(), id)) {
                System.out.println(entires.getKey() + " : " + entires.getValue());
                return;
            }
        }
        System.out.println("Invalid selection");
    }
}
