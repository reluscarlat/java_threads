package com.resc;

public class Printer extends Thread{
    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        for(int i = 0 ; i < Integer.MAX_VALUE; i++) {
            System.out.println("OOOOOOOO");
        }
    }
}
