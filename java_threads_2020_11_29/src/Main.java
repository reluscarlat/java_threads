import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    static final ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String args[]) {

        List<ThreadA> threads = new ArrayList<>();
        threads.add(new ThreadA(1000));
        threads.add(new ThreadA(1500));
        threads.add(new ThreadA(2000));
        threads.add(new ThreadA(2500));

        List<Future<?>> futures = new ArrayList<>();
        synchronized (executorService) {
            for (ThreadA thread : threads) {
                Future<?> future = executorService.submit(thread);
                futures.add(future);
            }
        }

//        A)
//        Block the execution of current thread and wait all threads A to finish
//        for(Future future : futures) {
//            try {
//                future.get();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        }

        recursiveCondition(futures);
    }

    // B)
    // Don't block the execution of current thread, but continue check if threads A finished
    public static void recursiveCondition(List<Future<?>> futures) {
        try {
            Thread.sleep(500);
            System.out.println("Waiting to finish all threadA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Future<?> future : futures) {
            if(!future.isDone()) {
                recursiveCondition(futures);
                return;
            }
        }
        ThreadB tB = new ThreadB();
        tB.start();
    }
}
