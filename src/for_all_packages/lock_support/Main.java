package for_all_packages.lock_support;

import java.util.concurrent.Semaphore;

public class Main {
        public static void main(String[] args) {
            Semaphore semaphore = new Semaphore(0);
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                // Просим разрешение и ждём, пока не получим его
                e.printStackTrace();
            }
            System.out.println("Hello, World!");
        }
}
