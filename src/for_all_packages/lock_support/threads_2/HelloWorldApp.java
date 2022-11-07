package for_all_packages.lock_support.threads_2;

import java.util.concurrent.TimeUnit;

public class HelloWorldApp {
    public static void main(String[] args) {
        Runnable task = () -> {

            try {
                TimeUnit.SECONDS.sleep(10);
                System.out.println("Wake up");
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        };

        Thread thread = new Thread(task);
        thread.start();
        thread.interrupt();
    }


}
