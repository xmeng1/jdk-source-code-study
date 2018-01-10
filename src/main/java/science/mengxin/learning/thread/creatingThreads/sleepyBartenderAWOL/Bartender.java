package science.mengxin.learning.thread.creatingThreads.sleepyBartenderAWOL;

import java.util.concurrent.TimeUnit;

public class Bartender implements Runnable {

    public void run() {
        int numTimesWoken = 0;

        System.out.println("Bartender: My boss isn't in today; time for a quick snooze!");

        while (true) {
            if (Thread.interrupted()) {
                System.out.println("Bartender: Zzz er erm, is someone waiting?");
            }

            if (numTimesWoken == 2) {
                break;
            }

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                numTimesWoken++;
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Bartender: This is so unfair! I'm off home.");
    }
}
