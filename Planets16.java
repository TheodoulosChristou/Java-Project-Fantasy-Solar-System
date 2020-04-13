
public class Planets
{
	private final double MASS_PLANET;
	private final double DISTANCE_PLANET;
	private final double PERIOD_PLANET;
	private final String NAME_PLANET;
	double massPlanet;
	double distancePlanet;
	double periodPlanet;
	
	public Planets (String name, double mass, double distance)
	{
		namePlanet = name;
		periodPlanet = Math.sqrt(distance*distance*distance);
		periodPlanet = Math.round( periodPlanet*1000)/1000.0; 
		massPlanet = Math.round(mass *1000)/1000.0;
		distancePlanet = Math.round(distance*1000)/1000.0;
	}
	
	public String toString()
	{
		return ( "Planet "+ namePlanet +" has a mass of "+ massPlanet + " Earths, is "+ distancePlanet + 
							"AU from its star, and orbits in "+ periodPlanet + " years\n");
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