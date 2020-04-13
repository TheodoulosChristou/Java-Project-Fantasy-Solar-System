import java.util.Random;

public class Planets
{
	ArrayList nameplanet = new ArrayList();
	private double mass;
	private double distance;
	private double period;
	String nameplanet;
	public addPlanet(String name, double mass, double distance)
	{
		this.planet=nameplanet;
		mass= rnd.nextDouble;
		distance= rnd.nextDouble;
		period=Math.sqrt(distance*distance*distance);
	}
	
	public toString()
	{
		return("Planet "+ nameplanet+ "has a mass of"+ mass + " is "+distance+ "AU from its start and obits in "+period+ "years");
	}
}