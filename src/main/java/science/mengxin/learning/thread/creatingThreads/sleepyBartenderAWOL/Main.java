package science.mengxin.learning.thread.creatingThreads.sleepyBartenderAWOL;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String args[]) {
        Bartender bartender = new Bartender();
        Thread bartenderThread = new Thread(bartender, "Bartender");

        bartenderThread.start();

        // Not very robust, but should allow the bartender to get to sleep first
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            // This can be ignored
        }

        int numCustomers = 5;

        Thread[] customerThreads = new Thread[numCustomers];

        for (int i = 1; i <= numCustomers; i++) {
            String customerName = "Customer " + i;
            Customer customer = new Customer(bartenderThread, customerName,
                    (int) (Math.random() * 10));

            customerThreads[i - 1] = new Thread(customer, customerName);
            customerThreads[i - 1].start();
        }

        // Yuk! Active waiting - we can do better in join below instead
        // while (bartenderThread.isAlive()) {}

        try {
            bartenderThread.join();
        } catch (InterruptedException e) {
            // This can be ignored
        }

        System.out.println("A voice: Hey! Isn't that the bartender sneaking out the door?");

        for (int i = 1; i <= numCustomers; i++) {
            customerThreads[i - 1].interrupt();
        }
    }
}
