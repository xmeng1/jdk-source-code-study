package science.mengxin.learning.thread.creatingThreads.timeunit;

import java.util.concurrent.TimeUnit;

public class SleepTimeouts
{
	public static void main(String[] args) throws InterruptedException {
		int val = 3;
		
		System.out.println("Sleeping for " + val + "us");
		TimeUnit.MICROSECONDS.sleep(val);
		
		System.out.println("Sleeping for " + val + "ms");
		TimeUnit.MILLISECONDS.sleep(val);
		
		System.out.println("Sleeping for " + val + "s");
		TimeUnit.SECONDS.sleep(val);
		
		System.out.println("Done");
	}
}
