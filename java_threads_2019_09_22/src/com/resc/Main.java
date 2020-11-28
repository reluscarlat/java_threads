package com.resc;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    private static int counter = 0;
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
//            Thread.sleep(40000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try{
//            printer.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t.start();







//        Thread t1 = new Thread(() -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            for(long i = 0; i < Long.MAX_VALUE; i++) {
//                System.out.println("T1");
//            }
//        });
//        Thread t2 = new Thread(() -> {
//            for(long i = 0; i < Long.MAX_VALUE; i++) {
//                System.out.println("T2");
//            }
//        });
//        t1.start();
//        t2.start();







//        Thread.currentThread().setPriority(7);
//        Printer2 p1 = new Printer2("000000");
//        Printer2 p2 = new Printer2("------");
//        System.out.println("p1 = " + p1.getPriority() + " | " + p2.getPriority());
//        Thread.currentThread().setPriority(10);
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
////        Printer3 p5 = new Printer3(arr, 0, arr.length - 1);
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
////        p5.start();
////        try {
////            p5.join();
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
//        long endTime = new Date().getTime();
//        System.out.println(endTime - startTime);
//
////        for(int i = 0; i < arr.length; i++){
////            System.out.println(arr[i]);
////        }





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






//        LOCKS
//        Object lock1 = new Object();
//        Object lock2 = new Object();
//
//        Thread t1 = new Thread(() -> {
//            for(int i = 0; i < 1000; i++) {
//                synchronized(lock1) {
//                    counter++;
//                }
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for(int i = 0; i < 1000; i++) {
//                synchronized(lock1) {
//                    counter++;
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(counter);



//        DEADLOCK
//        int i = 0;
//        while (i < 100) {
//            Deadlock deadlock = new Deadlock();
//            deadlock.executeDeadlock();
//        }





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






//        Object mutex = new Object();
//
//        Thread t1 = new Thread(() -> {
//            synchronized (mutex) {
//                for(int i = 0; i < 5; i++) System.out.print("A");
//                try {
//                    mutex.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                for(int i = 0 ; i < 5; i++) System.out.print("C");
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            // sleep 1 sec to be sure that t2 starts before t1 starts.
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            synchronized (mutex) {
//                for(int i = 0; i < 5; i++) {
//                    System.out.print("B");
//                }
//                mutex.notify();
//            }
//        });
//
//        t1.start();
//        t2.start();







        // Wait & Notify 2

//        Runner2 runner2 = new Runner2();
//        Thread t1 = new Thread(()->{
//            try {
//                runner2.firstThread();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        Thread t2 = new Thread(()->{
//            try {
//                runner2.secondThread();
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
//
//        ProducerConsumer2 pc2 = new ProducerConsumer2();
//
//        Thread t1 = new Thread(() -> {
//            try {
//                pc2.produce();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            try {
//                pc2.consume();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        t1.start();
//        t2.start();
//






//        Producer - Consumer With BlockingQueue

//        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
//
//        Thread producer = new Thread(() -> {
//            for(int i = 0; i < 50; i++) {
//                try {
//                    blockingQueue.put(i);
//                    System.out.println("Added " + i + "      size = " + blockingQueue.size());
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        Thread consumer = new Thread(() -> {
//            Integer removedItem;
//            while (true) {
//                try {
//                    removedItem = blockingQueue.take();
//                    System.out.println("Removed " + removedItem + "        size = " + blockingQueue.size());
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        producer.start();
//        consumer.start();







//        //Re-entrant Lock
//
//        Runner runner = new Runner();
//        Thread t1 = new Thread(() -> {
//            try {
//                runner.firstThread();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        Thread t2 = new Thread(() -> {
//            try {
//                runner.secondThread();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        t1.start();
//        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        runner.finished();
//
//
//







//      SEMAPHORE
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        for(int i = 0; i < 200; i++) {
//            Thread t = new Thread(()->{
//               Connection.getConnection().connect();
//            });
//            executorService.submit(t);
//        }
//
//        executorService.shutdown();
//
//        try {
//            executorService.awaitTermination(1, TimeUnit.DAYS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Finished");

//        SingletonEnum singletonEnum  = SingletonEnum.INSTANCE;
//        System.out.println(singletonEnum.getValue());
//        singletonEnum.setValue(1);
//        System.out.println(singletonEnum.getValue());







//        Runnable r1 = () -> {
//            for(int i = 0; i < 10; i++) {
//                System.out.println("A" + i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        Runnable r2 = () -> {
//            for(int i = 0; i < 10; i++) {
//                System.out.println("B" + i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//        Thread t3 = new Thread(r1);
//        try {
//            t1.start();
//            t1.join();
//            System.out.println("Intermediate");
//            t2.start();
//            t2.join();
//            t3.start();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Finish");

//        InterfaceImplementation ip = new InterfaceImplementation();
//        System.out.println(ip.getSquareOfValue());

//        Thread t = new Thread(() -> {
//            try {
//                Thread.sleep(Long.MAX_VALUE);
//            } catch (InterruptedException e) {
//                System.out.println(Thread.currentThread().getName() + " interrupted");
//            }
//        });
//        t.start();
//        t.interrupt();
//        while (t.isInterrupted()) {
//            System.out.println("A");
//        }
//        System.out.println(Thread.currentThread().getName() + " finished");




//        Child child = new Child();
//        Parent parent = new Child();
//        System.out.println(child.msg);
//        System.out.println(++parent.msg);





//        MySingleton mySingleton = MySingleton.INSTANCE;
//        System.out.println(mySingleton.getValue());
//        mySingleton.setValue(10);
//        System.out.println(mySingleton.getValue());





//        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
//        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();




//        TreeMap<Integer, String> sortedMap = new TreeMap();
//        sortedMap.put(2, "a");
//        sortedMap.put(1, "b");
//        sortedMap.put(5, "c");
//        sortedMap.put(3, "d");
//        sortedMap.put(9, "e");
//        sortedMap.put(0, "f");
//        sortedMap.values().forEach(key -> System.out.print(key + " "));





//        Integer a = null;
//        System.out.println(a);




//        Map<Integer, String> map = new LinkedHashMap<>();
//        map.put(2, "a");
//        map.put(1, "b");
//        map.put(5, "c");
//        map.put(3, "d");
//        map.put(9, "e");
//        map.put(0, "f");
//        map.entrySet().forEach(entry -> {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        });




//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1111111);
//        list.add(1111);
//        list.add(111);
//        list.add(11111);
//        list.sort((a,b) -> Integer.compare(a,b));
//        System.out.println(list.toString());





//        TreeSet<Integer> refersOrderTree = new TreeSet<>((a,b) -> Integer.compare(b,a));
//        refersOrderTree.add(1);
//        refersOrderTree.add(2);
//        refersOrderTree.add(3);
//        refersOrderTree.add(4);
//        refersOrderTree.add(5);
//        refersOrderTree.add(6);
//        System.out.println(refersOrderTree.toString());





//        Map<Integer, String> map = new LinkedHashMap<>();
//        map.put(2, "a");
//        map.put(1, "b");
//        map.put(5, "c");
//        map.put(3, "d");
//        map.put(9, "e");
//        map.put(0, "f");
//        map.entrySet().forEach(entry -> {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        });
//
//        map = Collections.unmodifiableMap(map);
//        map.put(10,"aaa");
//        System.out.println(map.toString());






//        String[] arr= new String[]{"b", "a", "c"};
//        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
//        System.out.println(list.toString());
//        String[] array = new String[list.size()];
//        list.toArray(array);
//        System.out.println(array);





//        ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[]{
////            "Ann", "John", "Bob", "Michael", "Regan"
////        }));
////        Iterator<String> iterator = list.iterator();
////        while (iterator.hasNext()) {
////            String name = iterator.next();
////            if(name == "John" || name == "Regan") {
////                iterator.remove();
////            }
////        }
////        System.out.println(list.toString());





//        ArrayList<Object> objList = new ArrayList<>();
//        objList.add("abc");
//        objList.add(new Integer(10));
//        for(Object o : objList) System.out.println(o);


//        String a = "abcd";
//        String b = "abcd";
//        System.out.println(a == b); // True
//        System.out.println(a.equals(b)); // True
//        String c = new String("abcd");
//        String d = new String("abcd");
//        System.out.println(c == d); // False
//        System.out.println(c.equals(d)); // True




//        Polimorphism

//        Parent p = new Parent();
//        System.out.println(p.msg);
//        p.printMsg();
//        p.printMsg2();
//
//        System.out.println();
//
//        Parent pc = new Child();
//        System.out.println(pc.msg);
//        pc.printMsg();
//        pc.printMsg2();
//
//        System.out.println();
//
//        Child c = new Child();
//        System.out.println(c.msg);
//        c.printMsg();
//        c.printMsg2();



//        Person p = new Person("Andrei", 25);
//        Optional<Person> personOptional = Optional.ofNullable(p);
//        System.out.println(personOptional);
//
//        Person p1 = null;
//        Optional<Person> personOptional1 = Optional.ofNullable(p1);
//        System.out.println(personOptional1.orElse(new Person("Bob", 22)));





//        Person p2 = new Person();
//        System.out.println(p2);



//        InterfaceTest it = new InterfaceTest() {
//            @Override
//            public int getValue() {
//                return 0;
//            }
//        };



//        A a = new A();
//        System.out.println(a.m1 + " " + a.m2);

//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        Node n4 = new Node(4);
//        Node n5 = new Node(5);
//        Node n6 = new Node(6);
//        Node n7 = new Node(7);
//        Node n8 = new Node(8);
//        Node n9 = new Node(9);
//
//
//
//        n5.left = n3;
//        n5.right = n7;
//        n3.left = n1;
//        n3.right = n4;
//        n7.left = n6;
//        n7.right = n8;
//
//        System.out.println(n5.find(3).value);

        char a = 'A', d = 'D';
        char grade = 'B';

        switch(grade) {
            case 'a':
            case 'B':
                System.out.println("great");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'd':
                System.out.println("asdfe");

        }

     }
}
