package science.mengxin.learning.thread.creatingThreads.goodbyeWorld;

import java.util.concurrent.TimeUnit;

public class Kenny implements Runnable
{
	public void run()
	{
		System.out.println("Hello World!");

		Thread currentThread = Thread.currentThread();
			
		while (!currentThread.isInterrupted())
		{
			System.out.println("I'm still alive!");
			
			try
			{
				TimeUnit.MILLISECONDS.sleep(500);
			}
			catch (InterruptedException e)
			{
				currentThread.interrupt();
			}
		}
		
		throw new RuntimeException("Goodbye cruel World!");
	}
}
