package com.resc;

import java.util.LinkedList;
import java.util.Random;

public class ProducerConsumer2 {
    private LinkedList<Integer> list = new LinkedList<>();
    private final int LIMIT = 10;
    private Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while(true) {
            synchronized (lock) {
                if(LIMIT == list.size()) {
                    lock.wait();
                }
                list.add(value++);
                System.out.print("List size is " + list.size() );
                System.out.println(" ; value added is " + value);
                lock.notify();
            }
            Thread.sleep(200);
        }
    }

    public void consume() throws InterruptedException {
        Random rand = new Random();
        while (true) {
            synchronized (lock) {
                if ( 0 == list.size()) {
                    lock.wait();
                }
                int value = list.removeFirst();
                System.out.print("List size is " + list.size() );
                System.out.println(" ; value deleted is " + value);
                lock.notify();
            }
            Thread.sleep(rand.nextInt(1000));
        }
    }
}
