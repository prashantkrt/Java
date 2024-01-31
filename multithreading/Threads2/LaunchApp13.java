package multithreading.Threads2;
/*
 * Synchronized method example
 * */
class CarShare2 implements Runnable {
    public void run() {
        //common part so can be access by all threads
        try {
            System.out.println(Thread.currentThread().getName() + " Has entered the parking lot");
            Thread.sleep(4000);
            //only one thread can operate at a time
            synchronized (this) { // lock to the current object
                System.out.println(Thread.currentThread().getName() + " Has got into the car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " started to drive car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " came back from the drive and park the car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " came out of parking lot");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LaunchApp13 {
    public static void main(String[] args) {
        CarShare2 cs = new CarShare2();

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
}
