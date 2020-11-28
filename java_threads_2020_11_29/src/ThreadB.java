public class ThreadB extends Thread{

    @Override
    public void run() {
        System.out.println("Message from thread B");
    }
}
