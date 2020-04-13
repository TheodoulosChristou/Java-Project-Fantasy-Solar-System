import java.util.ArrayList;
public class SolarSystem
{
	private String SolarSystemName;
	private double massSolarSystem;
	private double distanceSolarSystem;
	private double periodSolarSystem;
	private ArrayList <Planets> namePlanet = new ArrayList <>();
	
	public SolarSystem (String name)
	{
		this.SolarSystemName = name;
	}
	
	public void setNewSolar (String name)
	{
		SolarSystemName = name; 
	}
	
	public addPlanet(String name, double mass, double distance)
	{
		Planets NewSolar = new Planets(name, mass, distance);
		namePlanet.add(NewSolar);
	}
	
	public ArrayList getNamePlanet()
	{
		return namePlanet;
	}
	
	public String toString()
	{
		String name = (SolarSystemName + "\n" );
		for (int c = 0; c < namePlanet.length; i++)
		{
			name += namePlanet.get(c).toString());
		}
		return name;
	}
	
	public void printTable()
	{
		System.out.println( "Name" + "\t" + "Mass" + "\t" + "Distance" + "\t" + "Period (years) " );
		for (NewSolar elem: nameplanet)
		{
			System.out.println(elem.getNameofPlanet() + "\t" + elem.getmass()+ "\t" + elem.getdistance() + "\t" + elem.getperiod() + "\n");
		}