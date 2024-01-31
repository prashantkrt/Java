package ExceptionalHandling.class3;
import java.util.Scanner;

/*
 * matter cannot be propagated to caller method if you use simply if else instead of exception handling
 * */

class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
//        super(String.valueOf(message));
        super(message);
        // valueOf() in Java is used to convert any non String variable or Object such as int, double, char, and others to a newly created String object.
        // It returns the string representation of the argument passed.
    }
}

class Atm1 {
    // user will enter
    int acNo;
    int pw;

    //assume in database
    final private int acc_num = 1111;
    final private int password = 2222;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter your account number ");
        acNo = sc.nextInt();
        System.out.println("Kindly enter your account password ");
        pw = sc.nextInt();
    }

    public void verify() throws InvalidUserException {
        if (acc_num == acNo && password == pw) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kindly enter the amount to withdrawal");
            int amount = sc.nextInt();
            System.out.println("collect your cash " + amount);
            System.out.println("Thank-you for using our atm service . Have a good day ahead!!");
        } else {
//            System.out.println("Invalid userName and Password");
//            System.out.println("Are you sure this is your card ? want to try again!!!");
            throw new InvalidUserException("Invalid userName and Password "+"Are you sure this is your card ? want to try again!!!");
        }
    }
}

class GlobalBanK {
    public void initiate() {
        System.out.println("Welcome to Global Bank");
        Atm1 atm = new Atm1();
        // three attempts for invalid attempts
        try {
            atm.acceptInput();
            atm.verify();
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
            try {
                atm.acceptInput();
                atm.verify();
            } catch (InvalidUserException iue) {
                System.out.println(iue.getMessage());
                try {
                    atm.acceptInput();
                    atm.verify();
                } catch (InvalidUserException iu) {
                    System.out.println(iu.getMessage());
                    System.out.println("Your account blocked!!! :(");
                }
            }
        }
    }
}

public class LaunchEH12 {
    public static void main(String[] args) {
        GlobalBanK bank = new GlobalBanK();
        bank.initiate();
    }
}

