package multithreading.Threads3.InterThreadCommunication;

// producer consumer problem

/*
* Is producer class bothering whether
* consumer able to consume it or not
* Without even bothering it keeps on producing it.
*
* Same consumer is also not bothering it keeps on consuming the same data irrespective of
* that the producer already produced the new data
*
* They aren't bother of each other this problem called as producer consumer problem
* */
class Producer extends Thread {
    Queue q;

    public Producer(Queue q) {
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

class Queue {
    int i;

    public void put(int x) {
        i = x;
        System.out.println("I have put the data " + i);
    }

    public void get() {
        System.out.println("I have consumed the data " + i);
    }
}

class Consumer extends Thread {

    Queue q;

    public Consumer(Queue q) {
        this.q = q;
    }

    @Override
    public void run() {

        while (true) {
            q.get();
        }
    }
}

public class LaunchPC {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q); // will create new thread
        Consumer c = new Consumer(q); // will create new thread

        p.start();
        c.start();
    }
}
