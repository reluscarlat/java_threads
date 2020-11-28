public class ThreadA extends Thread {

    private int sleepTime;

    public ThreadA(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + "Finished after " + this.sleepTime);
    }
}
