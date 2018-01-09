package science.mengxin.learning.thread;

public class RealHelloWorldRunnable
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
