package ExceptionalHandling.class2;

public class LaunchEH9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("first Statement");
        Thread.sleep(2000);//2 sec
        System.out.println("Second Statement");
        Thread.sleep(2000); // checked exception-> Interrupted exception
        System.out.println("Third Statement");
    }
}

/*
 * Unchecked exceptions are those which compiler won't check for risky code developer has to analyze and handle it
 * Checked exception are those where compiler ask us to handle it
 * for checked exception compiler will sense the possibility of getting an exception during runtime
 * */

/*
 * RunTime exceptions are unchecked exceptions
 * The classes that directly inherit the Throwable class except RuntimeException
 * are known as checked exceptions.
 * For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.
 *
 *
 *  The classes that inherit the RuntimeException are known as unchecked exceptions.
 *  For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
 * No Such Element Exception
 * Undeclared Throwable Exception
 * Empty Stack Exception
 * Arithmetic Exception
 * Null Pointer Exception
 * Array Index Out of Bounds Exception
 * Security Exception
 * */