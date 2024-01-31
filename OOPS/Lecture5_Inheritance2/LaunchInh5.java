package OOPS.Lecture5_Inheritance2;

// note either this() or super() work, not both
class Animal {
    int age;

    Animal() {
        age = 2;
        System.out.println("Zero Param Animal cons");
    }

    Animal(int age) {
        this.age = age;
        System.out.println("Param Animal cons");
    }
}

class Lion extends Animal {
    int noOfLegs;

    Lion() {
        super(6);
        System.out.println("Zero Param Lion cons");
    }

    Lion(int noOfLegs) {
        this();
        this.noOfLegs = noOfLegs;
        System.out.println("Param Lion cons");
    }

    void display() {
        System.out.println(age);
        System.out.println(noOfLegs);
    }
}

public class LaunchInh5 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.display();
        Lion lion1 = new Lion(4);
        lion1.display();
    }
}
