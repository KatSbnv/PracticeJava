package for_all_packages.lock_support.thread_interrupt;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = ()->{
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("I'm working.. ");
            }
            System.out.println("Finished! ");
        };
        Thread thread = new Thread(task);
        thread.start();
//        thread.sleep(5);
        thread.interrupt();
    }
}
