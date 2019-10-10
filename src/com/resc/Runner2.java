package com.resc;

public class Runner2 {
    Object lock = new Object();

    public void firstThread() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Starting first thread");
            lock.wait();
            System.out.println("First thread completed");
        }
    }

    public void secondThread() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Starting second thread");
            lock.notify();
            System.out.println("Second thread completed");
        }
    }

}
