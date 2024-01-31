package multithreading.Threads2;
/*
 * Synchronized method example
 * */
class CarShare1 implements Runnable {
    synchronized public void run() {
        System.out.println(Thread.currentThread().getName() + " Has entered the parking lot");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Has got into the car");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " started to drive car");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " came back from the drive and park the car");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " came out of parking lot");
    }
}

public class LaunchApp12 {
    public static void main(String[] args) {
        CarShare1 cs = new CarShare1();

        Thread t1 = new Thread(cs);
        Thread t2 = new Thread(cs);
        Thread t3 = new Thread(cs);

        t1.setName("child1");
        t2.setName("child2");
        t3.setName("child3");

        t1.start();
        t2.start();
        t3.start();
    }

    /*
    * Restrict the single resource from multiple threads sharing the same resource
    * i) Synchronized method
    * ii) Synchronized block
    * */
}
