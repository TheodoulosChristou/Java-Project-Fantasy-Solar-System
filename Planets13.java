import java.util.Random;
public class Planets
{
	ArrayList nameplanet <NewSolar> = new ArrayList <NewSolar>();
	private double mass;
	private double distance;
	private double period;
	String nameplanet;
	int number;
	
	public nextplanet (String name, double mass, double distance , double period)
	{
		distance = rnd.nextDouble;
		period = Math.sqrt(distance*distance*distance);
		double roundedperiod = Math.round(period*1000)/1000.0; 
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
	
	public String getNameofPlanet()
	{
		return nameplanet;
	}
	
	public double getmass()
	{
		return mass;
	}
	
	public double getdistance()
	{
		return distance;
	}
	
	public double getperiod
	{
		return period;
	}
	
	
	
	
	
}