package com.resc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    Lock lock = new ReentrantLock();
    Condition cond = lock.newCondition();
    int count = 0;

    private void increment() {
        for(int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException {
        lock.lock();
        System.out.println("Starting first thread");
        cond.await();
        try {
            increment();
            System.out.println("First thread completed");
        } finally {
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException {
        lock.lock();
        System.out.println("Starting second thread");
        try {
            increment();
            System.out.println("Second thread completed");
            cond.signal();
        } finally {
            lock.unlock();
        }

    }

    public void finished() {
        System.out.println("Counter = " + count +" \n");
    }
}
