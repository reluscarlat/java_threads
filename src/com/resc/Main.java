package com.resc;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
//        Printer printer = new Printer();
//        Thread t = new Thread() {
//            @Override
//            public synchronized void start() {
//                super.start();
//            }
//
//            @Override
//            public void run() {
//                for(int i = 0; i < Integer.MAX_VALUE; i++) {
//                    System.out.println("-------------------------");
//                }
//            }
//        };
//        printer.start();
//        try {
//            printer.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t.start();

//        Thread.currentThread().setPriority(7);
//        Printer2 p1 = new Printer2("000000");
//        Printer2 p2 = new Printer2("------");
//        System.out.println("p1 = " + p1.getPriority() + " | " + p2.getPriority());
//        Thread.currentThread().setPriority(7);
//        System.out.println("p1 = " + p1.getPriority() + " | " + p2.getPriority());
//        p1.start();
//        p2.start();


//        Printer2 p1 = new Printer2("000000");
//        Printer2 p2 = new Printer2("------");
//        try {
//            p1.start();
//            p1.join();
////            p1.join(4000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        p2.start();



//        int[] arr = new int[100000000];
//        int chunk_len = arr.length / 4;
//        Printer3 p1 = new Printer3(arr, 0, chunk_len - 1);
//        Printer3 p2 = new Printer3(arr, chunk_len, chunk_len * 2 - 1);
//        Printer3 p3 = new Printer3(arr, chunk_len * 2, chunk_len * 3 - 1);
//        Printer3 p4 = new Printer3(arr, chunk_len * 3 , chunk_len * 4 - 1);
//
//        long startTime = new Date().getTime();
//
//        p1.start();
//        p2.start();
//        p3.start();
//        p4.start();
//
//        try {
//            p1.join();
//            p2.join();
//            p3.join();
//            p4.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        long endTime = new Date().getTime();
//        System.out.println(endTime - startTime);
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        int counter  = 0;
//
//        Thread t1 = new Thread(()->{
//            for(int i = 0; i < 1; i++) {
//                System.out.println("AAA");
//            }
//        });
//
//        Thread t2 = new Thread(()->{
//            for(int i = 0; i < 1; i++) {
//                System.out.println("BBB");
//            }
//        });
//
//        t1.start();
//        t2.start();
//        System.out.println("FINISH");
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


//        new Printer4().doWork();


//        // DEADLOCK
//        final Friend alphonse =
//                new Friend("Alphonse");
//        final Friend gaston =
//                new Friend("Gaston");
//        new Thread(new Runnable() {
//            public void run() { alphonse.bow(gaston); }
//        }).start();
//        new Thread(new Runnable() {
//            public void run() { gaston.bow(alphonse); }
//        }).start();


        //EXECUTOR
//        int numberOfThreads = 2;
//        int numberofTasks = 5;
//        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
//        for(int id = 0; id < numberofTasks; id++) {
//            Processor p = new Processor(id);
//            executorService.submit(p);
//        }
//        executorService.shutdown();
//
//        System.out.println("All tasks submitted");
//        try {
//            executorService.awaitTermination(1, TimeUnit.DAYS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("All tasks terminated");



//        // Count Down Latch
//        int numberOfTasks = 7;
//        CountDownLatch countDownLatch = new CountDownLatch(numberOfTasks);
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        for(int i = 0; i < numberOfTasks; i++) {
//            Thread t = new Thread(new Processor2(i,countDownLatch));
//            executorService.submit(t);
//        }
//
//        try {
//            countDownLatch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("All tasks completed. " + executorService.isTerminated() + " " + executorService.isShutdown());





        // Wait & Notify

//        Processor3 processor = new Processor3();
//
//        Thread t1 = new Thread(() -> {
//            try {
//                processor.produce();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        Thread t2 = new Thread(() -> {
//            try {
//                processor.consume();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        t1.start();
//        t2.start();


        // Producer & Consumer

//        int numberOfThreads = 15;
//        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads + 1);
//        ProducerConsumer pc = new ProducerConsumer();
//        Thread producer = new Thread(() -> {
//            pc.produce();
//        });
//        executorService.submit(producer);
//        for(int i = 0; i < numberOfThreads; i++) {
//            Thread consumer = new Thread(() -> {
//                pc.consume();
//            });
//            executorService.submit(consumer);
//        }
//        executorService.shutdown();
//        try {
//            executorService.awaitTermination(1, TimeUnit.DAYS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Process terminated");




        // Producer & Consumer 2

        ProducerConsumer2 pc2 = new ProducerConsumer2();

        Thread t1 = new Thread(() -> {
            try {
                pc2.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                pc2.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();


    }
}
