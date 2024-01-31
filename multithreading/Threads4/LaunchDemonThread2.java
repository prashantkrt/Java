package multithreading.Threads4;

class MSword1 implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("Type")) {
            typing();
        } else if (threadName.equals("SpellCheck")) {
            spellCheck();
        } else {
            autoSave();
        }
    }

    //Primary task
    public void typing() {
        for (int i = 0; i < 4; i++) {
            System.out.println("typing...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //secondary task
    public void spellCheck() {
        for (; ; ) { //as it's a demon thread its life depends on the primary thread
            System.out.println("spell checking...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //secondary task
    public void autoSave() {
        for (; ; ) {// as it's a demon thread its life depends on the primary thread
            System.out.println("auto saving...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class LaunchDemonThread2 {
    public static void main(String[] args) {
        MSword1 ms = new MSword1();

        Thread t1 = new Thread(ms);
        Thread t2 = new Thread(ms);
        Thread t3 = new Thread(ms);

        t1.setName("Type");
        t2.setName("SpellCheck");
        t3.setName("AutoSave");


        t2.setDaemon(true); // making secondary thread as demon
        t3.setDaemon(true); // making secondary thread as demon

        t2.setPriority(2); // make priority less than 5
        t3.setPriority(3); // make priority less than 5

        t1.start();
        t2.start();
        t3.start();
    }
}


/*
 * Demon Thread : It is a low priority thread. It is a background thread.
 * It is a secondary thread. It can execute in between also but make sure to execute at least
 * single time.
 * Demon thread life depends on the primary threads
 * */