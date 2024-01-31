package multithreading.Threads1;

public class LaunchApp2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");

        Thread thread = Thread.currentThread();
        String threadName = thread.getName();
        System.out.println(threadName);
       //Thread.sleep(5000);

        //same but we can write this way too..
        String threadName2 = Thread.currentThread().getName();
        System.out.println(threadName2);

        //more easy
        System.out.println(Thread.currentThread().getName());

        System.out.println("Main thread completed the task");


        // priority : more the number higher the priority
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setName("mainChanged");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getPriority());

    }
}
