package science.mengxin.learning.thread.creatingThreads.dateFormatter.threadLocal;

import java.text.SimpleDateFormat;

public class DateFormatterExample
{
	public static class DateFormatterThreadLocal extends ThreadLocal<SimpleDateFormat> {
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("EEE MMM d, hh:mm:ss");
		}
	}
	
	public static DateFormatterThreadLocal dateFormatterVar = new DateFormatterThreadLocal();
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new DatePrinter("Formatter 1"), "Formatter 1");
		Thread t2 = new Thread(new DatePrinter("Formatter 2"), "Formatter 2");
		
		t1.start();
		t2.start();
	}
}
