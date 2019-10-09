package com.resc;

public class Printer2 extends Thread {
    private String message = null;

    Printer2(String message) {
        this.message = message;
    }

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 3000000; i++) {
            System.out.println(this.message);
        }
    }
}
