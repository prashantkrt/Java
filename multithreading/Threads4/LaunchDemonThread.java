package multithreading.Threads4;

class MSword implements Runnable {

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

    public void spellCheck() {
        for (int i = 0; i < 4; i++) {
            System.out.println("spell checking...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void autoSave() {
        for (int i = 0; i < 4; i++) {
            System.out.println("auto saving...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class LaunchDemonThread {
    public static void main(String[] args) {
        MSword ms = new MSword();

        Thread t1 = new Thread(ms);
        Thread t2 = new Thread(ms);
        Thread t3 = new Thread(ms);

        t1.setName("Type");
        t2.setName("SpellCheck");
        t3.setName("AutoSave");

        t1.setPriority(5);
        t2.setPriority(6);
        t3.setPriority(7);//highest

        t1.start();
        t2.start();
        t3.start();
    }
}


/*
* Demon Thread : It is a low priority thread. It is a background thread.
* It is a secondary thread. It can execute in between also but make sure to execute atleast
* 1 time.
*
*
* */