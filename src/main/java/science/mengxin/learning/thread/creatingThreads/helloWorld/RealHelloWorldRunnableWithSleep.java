package science.mengxin.learning.thread.creatingThreads.helloWorld;

public class RealHelloWorldRunnableWithSleep
{
	public static class Greeter implements Runnable
	{
		private String country;
		
		public Greeter(String country)
		{
			this.country = country;
		}

		public void run()
		{
			try
			{
				Thread.sleep(10000);
			}
			catch (InterruptedException e)
			{
				// Safe to ignore this
				// We'll discuss it shortly
			}
			
			System.out.println("Hello " + country + "!");
		}
	}

	public static void main(String[] args)
	{
		String countries[] = { "France", "India", "China", "USA", "Germany" };

		for (String country : countries)
		{
			Greeter greeter = new Greeter(country);
			new Thread(greeter, country + " thread").start();
		}
	}
}
