
public class Planets
{
	private final double MASS_PLANET;
	private final double DISTANCE_PLANET;
	private final double PERIOD_PLANET;
	private final String NAME_PLANET;
	private double massPlanet;
	private double distancePlanet;
	private double periodPlanet;
	
	public Planets (String name, double mass, double distance)
	{
		NAME_PLANET = name;
		MASS_PLANET = mass;
		DISTANCE_PLANET = distance;
		PERIOD_PLANET = Math.sqrt(distance*distance*distance);
		periodPlanet = Math.round( PERIOD_PLANET*1000)/1000.0; 
		massPlanet = Math.round(MASS_PLANET *1000)/1000.0;
		distancePlanet = Math.round(DISTANCE_PLANET*1000)/1000.0;
	}
	
	public String toString()
	{
		return ( "Planet " + NAME_PLANET +" has a mass of "+ massPlanet + " Earths, is "+ distancePlanet + 
							"AU from its star, and orbits in "+ periodPlanet + " years\n");
	}
	
	public String getNameofPlanet()
	{
		return NAME_PLANET;
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