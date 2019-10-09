package com.resc;

public class Printer4 {
    private int counter = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void doWork() {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000000; i++) {
               synchronized (lock1) {
                   counter++;
               }
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000000; i++) {
                synchronized (lock2) {
                    counter++;
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }

}
