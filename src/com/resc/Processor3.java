package com.resc;

import java.util.Scanner;

public class Processor3 {
    private Object lock = new Object();

    public void produce() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Producer thread running... ");
            lock.wait();
            System.out.println("Resumed.");
        }
    }

    public void consume() throws InterruptedException {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Waiting for return key to be pressed.");
            scanner.nextLine();
            System.out.println("Return key pressed.");
            lock.notify();
            Thread.sleep(2000);
        }
    }

}
