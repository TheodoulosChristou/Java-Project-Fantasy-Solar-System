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
	
	public void addPlanet(String name, double mass, double distance)
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
		for (int c = 0; c < namePlanet.size(); c++)
		{
			name += namePlanet.get(c).toString();
		}
		return name;
	}
	
	public void printTable()
	{
		System.out.println("\n" + "Name" + "\t\t" + "Mass" + "\t\t" + "Distance" + "\t\t" + "Period (years)" );
		for (Planets elem: namePlanet)
		{
			System.out.println(elem.getNameofPlanet() + "\t\t" + elem.getmass()+ "\t\t" + elem.getdistance() + "\t\t\t" + elem.getperiod());
		}
		
	}
}