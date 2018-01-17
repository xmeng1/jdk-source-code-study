package science.mengxin.learning.thread.creatingThreads.dateFormatter.shared;

import java.text.SimpleDateFormat;

public class DateFormatterExample
{
	public static SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE MMM d, hh:mm:ss");
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new DatePrinter("Formatter 1"), "Formatter 1");
		Thread t2 = new Thread(new DatePrinter("Formatter 2"), "Formatter 2");
		
		t1.start();
		t2.start();
	}
}
