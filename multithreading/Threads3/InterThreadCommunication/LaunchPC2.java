package multithreading.Threads3.InterThreadCommunication;

// applying to inter-thread communication
// using wait() and notify()
class Producer1 extends Thread {
    Queue1 q;

    public Producer1(Queue1 q) {
        this.q = q;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            q.put(i++);
        }
    }
}

class Queue1 {
    int i;
    boolean flag = false;

    synchronized public void put(int x) {  // at a time only one producer
        try {
            if (flag) { // if true
                wait();
            } else {
                i = x;
                System.out.println("I have put the data " + i);
                flag = true;
                notify();// to notify to come out of wait state
            }
        } catch (Exception e) {
            System.out.println("Some problem occurred");
        }
    }

    synchronized public void get() { // at a time only one consumer
        try {
            if (!flag) { // if false
                wait();
            } else {
                System.out.println("I have consumed the data " + i);
                flag = false;
                notify();
            }
        } catch (Exception e) {
            System.out.println("Some problem occurred");
        }
    }
}

class Consumer1 extends Thread {
    Queue1 q;

    public Consumer1(Queue1 q) {
        this.q = q;
    }

    @Override
    public void run() {

        while (true) {
            q.get();
        }
    }
}

public class LaunchPC2 {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        Producer1 p = new Producer1(q); // will create new thread
        Consumer1 c = new Consumer1(q); // will create new thread

        p.start();
        c.start();
    }
}
