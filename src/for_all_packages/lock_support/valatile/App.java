package for_all_packages.lock_support.valatile;

public class App {
    public static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Runnable whileFlagFalse = () -> {
            while(!flag) {
            }
            System.out.println("Flag is now TRUE");
        };

        new Thread(whileFlagFalse).start();
        Thread.sleep(1000);
        flag = true; //this part of the code will not be seen by another thread. because of the cash
    }
}
