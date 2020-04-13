
public class Planets
{
	//Here are the values that we need
	private final double MASS_PLANET;
	private final double DISTANCE_PLANET;
	private final double PERIOD_PLANET;
	private final String NAME_PLANET;
	private double massPlanet;
	private double distancePlanet;
	private double periodPlanet;
	
	//round the distance, the period and the mass 
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
	
	// this method returns a message that has the name of the planet
	// the mass of the planet, the distance of the planet
	// and the period of the planet
	public String toString()
	{
		return ( "Planet " + NAME_PLANET +" has a mass of "+ massPlanet + " Earths, is "+ distancePlanet + 
							"AU from its star, and orbits in "+ periodPlanet + " years\n");
	}
	
	//this method returns the name of the planet
	public String getNameofPlanet()
	{
		return NAME_PLANET;
	}
	// this method returns the mass of the planet
	public double getmass()
	{
		return massPlanet;
	}
	
	// this method returns the distance of the planet
	public double getdistance()
	{
		return distancePlanet;
	}
	
	// this method returns the period of the planet 
	public double getperiod()
	{
		return periodPlanet;
	}
}