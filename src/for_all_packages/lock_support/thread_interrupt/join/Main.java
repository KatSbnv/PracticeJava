package for_all_packages.lock_support.thread_interrupt.join;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = ()-> {
            try {
                System.out.println("I'm working.. ");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("I've slept! ");
            } catch (InterruptedException e) {
                System.out.println("Interrupted! ");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        thread.join();
        System.out.println("Finished! ");
    }
}
