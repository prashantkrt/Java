package multithreading.Threads3;

class Library implements Runnable {
    final String res1 = new String("Java DSA book");
    final String res2 = new String("Java Spring Boot book");
    final String res3 = new String("MERN book");

    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("Student1")) {
            try {
                Thread.sleep(4000);
                //lock the resource
                synchronized (res1) {
                    System.out.println("Student 1 has acquired resource 1 " + res1);
                    Thread.sleep(4000);
                    synchronized (res2) {
                        System.out.println("Student 1 has acquired resource 2 " + res2);
                        Thread.sleep(4000);
                        synchronized (res3) {
                            System.out.println("Student 1 has acquired resource 3 " + res3);
                            Thread.sleep(5000);
                        }
                    }
                }

            } catch (InterruptedException e) {
                System.out.println("Some error occurred");
            }
        } else {
            try {
                Thread.sleep(4000);
                synchronized (res1) {
                    System.out.println("Student 2 has acquired resource 1 " + res1);
                    Thread.sleep(4000);
                    synchronized (res2) {
                        System.out.println("Student 2 has acquired resource 2 " + res2);
                        Thread.sleep(4000);
                        synchronized (res3) {
                            System.out.println("Student 2 has acquired resource 3 " + res3);
                            Thread.sleep(5000);
                        }
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Some error occurred");
            }
        }
    }
}

public class LaunchDL {
    public static void main(String[] args) {
        Library lib = new Library();

        Thread t1 = new Thread(lib);// (new state)
        Thread t2 = new Thread(lib);//(new state)

        t1.setName("Student1");
        t2.setName("Student2");

        t1.start(); //(runnable)
        t2.start(); //(runnable)
    }
}


/* output : ->
Student 1 has acquired resource 1 Java DSA book
Student 1 has acquired resource 2 Java Spring Boot book
Student 1 has acquired resource 3 MERN book
Student 2 has acquired resource 1 Java DSA book
Student 2 has acquired resource 2 Java Spring Boot book
Student 2 has acquired resource 3 MERN book
*/


