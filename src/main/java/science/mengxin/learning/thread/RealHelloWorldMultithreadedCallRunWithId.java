package science.mengxin.learning.thread;

public class RealHelloWorldMultithreadedCallRunWithId
{
	public static class Greeter extends Thread
	{
		private String country;
		
		public Greeter(String country)
		{
			super(country + " thread"); // call the thread constructor to name the thread
			this.country = country;
		}

		public void run()
		{
			// Use Thread.currentThread() to get the Thread instance for the running thread
			// Why do you think long id = getId() gives a different result?
			long id = Thread.currentThread().getId();
			
			System.out.println(id + ": Hello " + country + "!");
		}
	}

	public static void main(String[] args)
	{
		String countries[] = { "France", "India", "China", "USA", "Germany" };

		for (String country : countries)
		{
			new Greeter(country).run(); // Calls run() directly instead of start() (don't do this!)
		}
	}
}
