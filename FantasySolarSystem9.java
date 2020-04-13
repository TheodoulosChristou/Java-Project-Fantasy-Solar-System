import java.util.Scanner;
import java.util.Random;

public class FanstasySolarSystem
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		
		int i = 0;
		boolean flag = false;
		
		String SolarSystemName;
		String nameplanet;
		
		System.out.println("Enter the name of the solar system:");
		SolarSystemName = in.nextLine();
		SolarSystem newSolar = new SolarSystem(SolarSystemName);
		
		System.out.println("Enter the planet names - type "done" to finish");
		
		do
		{
			System.out.println("Enter name: ");
			nameplanet = in.nextLine();
			if (nameplanet.equalsIgnoreCase("done")
			{
				flag = true;
			}
			else
			{
				System.out.println("Enter name:");
				String nameplanet =in.nextLine();
				double mass = rnd.nextDouble()* 120;
				double distance = rnd.nextDouble()*10 + 1 ;
				nextplanet.addPlanet(name, mass, distance);
				System.out.print(nextplanet.getNamePlanet().get(i).toString());
				i++;
			}
		}
		while ( !flag );
		
		nextplanet.printTable();