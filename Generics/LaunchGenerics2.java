package Generics;

interface IGen<T> {
    void display();
}

class Humans {
    public void sleep() {
        System.out.println("Sleeping");
    }
}

class GenR<T> implements IGen<String> {
    T ref;

    public GenR() {

    }

    public GenR(T ref) {
        this.ref = ref;
    }

    public void display() {
        System.out.println("The type passed to java is " + ref.getClass().getName());
    }
}

public class LaunchGenerics2 {
    public static void main(String[] args) {

        GenR<Integer> genr = new GenR<>(10);
        System.out.println(genr.ref);
        genr.display();//java.lang.Integer

        GenR<String> genr2 = new GenR<>("Prashant");
        System.out.println(genr2.ref);
        genr2.display();//java.lang.String

        GenR<Humans> genr3 = new GenR<>(new Humans());
        System.out.println(genr3.ref);
        genr3.display();//Generics.Human1

        IGen<String> g = new GenR<>(10);
        g.display();//java.lang.Integer

        IGen<String> g1 = new GenR<>("Prashant");
        g1.display();//java.lang.String
    }
}
