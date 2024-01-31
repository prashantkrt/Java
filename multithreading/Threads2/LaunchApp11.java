package multithreading.Threads2;
/*
 * Synchronized method
 * Synchronized block
 * */
class CarShare implements Runnable {
    public void run() {
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

public class LaunchApp11 {
    public static void main(String[] args) {
        CarShare cs = new CarShare();

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
    * Above at a time three threads cannot drive the car , use the parking lot etc.
    * we need to restrict it so that one thread can utilize the resource at at time
    *
    * */

    /*
    * Restrict the single resource from multiple threads sharing the same resource
    * i) Synchronized method
    * ii) Synchronized block
    * */
}
