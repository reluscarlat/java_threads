package com.resc;

public class Deadlock {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void executeDeadlock() {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("T1 - L1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2)  {
                    System.out.println("T1 - L2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
           synchronized (lock2) {
               System.out.println("T2 - L2");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (lock1) {
                   System.out.println("T2 - L1");
               }
           }
        });

        t1.start();
        try {
            t1.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------");
    }
}
