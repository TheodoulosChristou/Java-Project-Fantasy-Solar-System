import java.util.Random;
public class Planets
{
	private double massPlanet;
	private double distancePlanet;
	private double periodPlanet;
	private String namePlanet;
	
	public Planets (String name, double mass, double distance)
	{
		namePlanet = name;
		periodPlanet = Math.sqrt(distance*distance*distance);
		double periodPlanet = Math.round(period*1000)/1000.0; 
		massPlanet = Math.round(mass *1000.0)/1000);
		distancePlanet = Math.round(distance*1000.0)/1000);
	}
	
	public String toString()
	{
		String messageString= "Planet "+ namePlanet + "has a mass of"+ massPlanet + " is "+ distancePlanet + "AU from its start and obits in "+ periodPlanet + "years";
		return messageString;
	}
	
	public String getNameofPlanet()
	{
		return namePlanet;
	}
	// this method gets themass return
	public double getmass()
	{
		return massPlanet;
	}
	
	public double getdistance()
	{
		return distancePlanet;
	}
	
	public double getperiod()
	{
		return periodPlanet;
	}
	
	
	
	
	
}