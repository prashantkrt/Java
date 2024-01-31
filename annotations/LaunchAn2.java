package annotations;
/*
 * Create our own annotations:-
 * -> Annotations are created based on the interface mechanism.
 * -> attach @
 * -> i) specify the target like :- class or method etc.
 * -> ii) Retention policy (till where do you want it to convey)
 * */

import java.lang.annotation.*;

/*
Type  :- Class, interface or enumeration
Field :- Field
Method :- Method
Constructor :- Constructor
Local_Variable :- Local variable
Annotation_Type :- Annotation Type
Package :- PACKAGE
* */

//@Target(ElementType.TYPE)//this can be used for class
//@Target((ElementType.FIELD)//for instant variable

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {

    String country() default "India";

    int age() default 34;
}

@CricketPlayer(country = "India", age = 35)
class RohitSharma {
    int runs;
    int matches;

    public RohitSharma() {
        System.out.println("Rohit did his best");
    }

    @CricketPlayer(country = "India", age = 35)
    public RohitSharma(int runs, int matches) {
        super();
        this.runs = runs;
        this.matches = matches;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }
}

public class LaunchAn2 {
    public static void main(String[] args) {

        RohitSharma rs = new RohitSharma();
        rs.setMatches(100);
        rs.setRuns(10000);
        System.out.println(rs.getRuns());
        System.out.println(rs.getMatches());

        Class cls = rs.getClass();
        Annotation an = cls.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer) an;
        System.out.println(cp.age());
        System.out.println(cp.country());

    }
}
