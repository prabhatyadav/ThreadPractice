package prabhat.practice.yield;

public class YeildExample {
    public static void main(String args[]) {
        YeildRunnable yr = new YeildRunnable();
        ThreadGroup allThreads = new ThreadGroup("All Thread");
        Thread t1 = new Thread(allThreads, yr, "t1");
        Thread t2 = new Thread(allThreads, yr, "t2");
        Thread t3 = new Thread(allThreads, yr, "t3");
        Thread t4 = new Thread(allThreads, yr, "t4");
        Thread t5 = new Thread(allThreads, yr, "t5");
        Thread t6 = new Thread(allThreads, yr, "t6");
        Thread t7 = new Thread(allThreads, yr, "t7");
        Thread t8 = new Thread(allThreads, yr, "t8");
        Thread t9 = new Thread(allThreads, yr, "t9");
        Thread t10 = new Thread(allThreads, yr, "t10");


        t1.setPriority(10);
        t2.setPriority(10);
        t3.setPriority(10);

        t4.setPriority(5);
        t5.setPriority(5);
        t6.setPriority(5);

        t7.setPriority(1);
        t8.setPriority(1);
        t9.setPriority(1);
        t10.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();


    }
}
