package science.mengxin.learning.thread.creatingThreads.helloWorld;


public class RealHelloWorldSingleThreaded
{
	public static void main(String args[])
	{
		String countries[] = { "France", "India", "China", "USA", "Germany" };
		
		for (String country : countries)
		{
			System.out.println("Hello " + country + "!");
		}
		
		// In Java 8, we could do the following:
		
		//Arrays.stream(countries).
	    //   forEach(country -> System.out.println("Hello " + country + "!"));
	}
}
