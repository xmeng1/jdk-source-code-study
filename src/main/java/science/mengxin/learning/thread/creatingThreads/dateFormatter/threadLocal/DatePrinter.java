package science.mengxin.learning.thread.creatingThreads.dateFormatter.threadLocal;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DatePrinter implements Runnable
{
	private String name;
	
	public DatePrinter(String name) {
		this.name = name;
	}
	
	public void run() {
		if (name.equals("Formatter 1")) {
			System.out.println(name + " is setting the formatting pattern");
			DateFormatterExample.dateFormatterVar.get().applyPattern("hh:mm:ss");
		}
		
		while (true) {
			try
			{
				TimeUnit.SECONDS.sleep(1);
			}
			catch (InterruptedException e)
			{
				// Can ignore
			}
			
			Date now = new Date();
			
			System.out.println(name + ": " + DateFormatterExample.dateFormatterVar.get().format(now));
		}
	}
}
