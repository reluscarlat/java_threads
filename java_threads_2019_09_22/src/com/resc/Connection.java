package com.resc;

import java.util.concurrent.Semaphore;

public class Connection {
    private static Connection connection = null;
    private static int connections = 0;
    private static Semaphore semaphore = new Semaphore(10);

    private Connection() {

    }

    public static synchronized Connection getConnection() {
        if(connection == null) {
            connection = new Connection();
        }
        return connection;
    }

    public void connect() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            connections++;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            connections--;
        }
        System.out.println("Current connections " + connections);
        semaphore.release();
    }

}
