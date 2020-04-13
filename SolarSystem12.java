import java.util.ArrayList;
public class SolarSystem
{
	// Here are the values that wee need 
	private String SolarSystemName;
	private double massSolarSystem;
	private double distanceSolarSystem;
	private double periodSolarSystem;
	// we create an arraylist for the planets
	private ArrayList <Planets> namePlanet = new ArrayList <>();
	
	// this method set the name of solarsystem
	public SolarSystem (String name)
	{
		SolarSystemName = name;
	}
	
	// this method add the new planets in a newsolar object
	public void addPlanet(String name, double mass, double distance)
	{
		Planets NewSolar = new Planets(name, mass, distance);
		namePlanet.add(NewSolar);
	}
	
	// this method returns the name of the planet
	public ArrayList getNamePlanet()
	{
		return namePlanet;
	}
	
	// this method saves the name into the arraylist
	public String toString()
	{
		String name = (SolarSystemName + "\n" );
		for (int c = 0; c < namePlanet.size(); c++)
			
		{
			name += namePlanet.get(c).toString();
		}
		return name;
	}
	
	// this method creates the table of that arraylist 
	public void printTable()
	{
		System.out.println(SolarSystemName+"\n");
		System.out.println("Name" + "\t\t" + "Mass" + "\t\t" + "Distance" + "\t\t" + "Period (years)" );
		for (Planets elem: namePlanet)
		{
			System.out.println(elem.getNameofPlanet() + "\t\t" + elem.getmass()+ "\t\t" + elem.getdistance() + "\t\t\t" + elem.getperiod());
		}
		
	}
}