package com.resc;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton = null;
    private ThreadSafeSingleton(){};
    public static synchronized ThreadSafeSingleton getInstance() {
        if(threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        } else {
            System.out.println("ThreadSafeSingleton is already instantiated.");
        }
        return threadSafeSingleton;
    }
}
