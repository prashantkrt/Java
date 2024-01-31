package ExceptionalHandling.class3;

import java.util.Scanner;

//age < 18
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

// age above 60
class OverAgeException extends Exception {
    public OverAgeException(String message) {
        super(message);
    }
}

class Applicant {
    int age;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter you age");
        age = sc.nextInt();
    }

    public void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            throw new UnderAgeException("you are under Age for license.Not eligible");
        } else if (age > 60) {
            throw new OverAgeException("You are over age for license. Not eligible");
        } else {
            System.out.println("Your are eligible to apply for licence");
        }
    }
}

class RTO {

    public void initiate() {
        Applicant app = new Applicant();
        try {
            app.input();
            app.verify();
        } catch (UnderAgeException uae) {
            System.out.println(uae.getMessage());
            try {
                app.input();
                app.verify();
            } catch (UnderAgeException | OverAgeException ua) {
                System.out.println(ua.getMessage());
            }
        } catch (OverAgeException oae) {
            System.out.println(oae.getMessage());
            try {
                app.input();
                app.verify();
            } catch (UnderAgeException | OverAgeException ua) {
                System.out.println(ua.getMessage());
            }
        }
    }
}

public class LaunchEH13 {
    public static void main(String[] args) {
        RTO rto = new RTO();
        rto.initiate();
    }
}
