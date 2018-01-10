package science.mengxin.learning.thread.creatingThreads.sleepyBartenderAWOL;

import java.util.concurrent.TimeUnit;

public class Customer implements Runnable {

    private Thread bartenderThread;
    private String name;
    private int waitTime;

    public Customer(Thread bartenderThread, String name, int waitTime) {
        this.bartenderThread = bartenderThread;
        this.name = name;
        this.waitTime = waitTime;
    }

    public void run() {
        System.out.println(name + ": Doesn't seem to be anyone around. I'll wait a moment");

        try {
            TimeUnit.SECONDS.sleep(waitTime);
        } catch (InterruptedException e) {
            System.out.println(name + ":Hey! Where is the bartender going? I'm telling my lawyer!");
            return;
        }

        System.out.println(name + ": Oh there's a bell! Can I get some service around here?");

        bartenderThread.interrupt();
    }
}
