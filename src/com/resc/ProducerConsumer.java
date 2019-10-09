package com.resc;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    BlockingQueue<Integer> queue ;
    Random rand ;
    Object lock1 = new Object();
    Object lock2 = new Object();

    public ProducerConsumer() {
        queue = new ArrayBlockingQueue<>(10);
        rand = new Random();
    }

    public static void run() {

    }

    public void consume() {
        synchronized (lock1) {
            while(true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(2 < rand.nextInt(10)) {
                    try {
                        int val = queue.take();
                        System.out.println("Size of queue = " + queue.size() + " | " + "Value " + val + " removed");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void produce() {
        synchronized (lock2) {
            while(true) {
                try {
                    Thread.sleep(150);
                    int val = rand.nextInt(100);
                    queue.put(val);
                    System.out.println("Size of queue = " + queue.size() + " | " + "Value " + val + " added");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
