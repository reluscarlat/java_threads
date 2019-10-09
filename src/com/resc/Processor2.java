package com.resc;

import java.util.concurrent.CountDownLatch;

public class Processor2 implements Runnable{
    private CountDownLatch countDownLatch;
    private int id;

    Processor2(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Started: " + id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed: " + id);
        countDownLatch.countDown();
    }
}
