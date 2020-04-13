import java.util.Random;
public class Planets
{
	ArrayList nameplanet <NewSolar> = new ArrayList <NewSolar>();
	private double mass;
	private double distance;
	private double period;
	String nameplanet;
	
	public nextplanet (String name, double mass, double distance)
	{
		this.nameplanet=name;
		mass= rnd.nextDouble;
		distance= rnd.nextDouble;
		period=Math.sqrt(distance*distance*distance);
	}
	
	public String toString()
	{
		String messageString= "Planet "+ name+ "has a mass of"+ mass + " is "+distance+ "AU from its start and obits in "+period+ "years";
		for (NewSolar elem : nameplanet)
		{
			messageString= elem: "\n";
		}
		return messageString;
	}
	
	
}