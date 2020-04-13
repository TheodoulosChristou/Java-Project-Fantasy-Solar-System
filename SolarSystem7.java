import java.util.ArrayList;
public class SolarSystem
{
	String NewSolar;
	ArrayList  <Planets> nameplanet = new ArrayList <>();
	public void NewSolar (String SolarSystemName)
	{
		SolarSystemName= NewSolar; 
	}
	
	public addPlanet(String name, double mass, double distance, double period)
	{
		this.nameplanet=name;
		nameplanet.add(new NewSolar)
		nameplanet NewSolar = new NewSolar(name, mass, distance);
		
		period=Math.sqrt(distance*distance*distance);
	}
	
	public ArrayList getNamePlanet()
	{
		return nameplanet;
	}
	
	public void printTable()
	{
		System.out.println( "Name" + "\t" + "Mass" + "\t" + "Distance" + "\t" + "Period (years) " );
		for (NewSolar elem: nameplanet)
		{
			System.out.println(elem.getNameofPlanet() + "\t" + elem.getmass()+ "\t" + elem.getdistance() + "\t" + elem.getperiod() + "\n");
		}