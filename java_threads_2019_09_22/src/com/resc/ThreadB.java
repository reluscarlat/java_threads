package com.resc;

public class ThreadB extends Thread {

    int counter = 0;

    @Override
    public void run() {
        synchronized (this) {
            for(int i = 0; i < 100; i++) {
                counter++;
            }
        }
    }
}
