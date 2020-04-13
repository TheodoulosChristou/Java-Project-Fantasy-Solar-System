import java.util.Scanner;
import java.util.Random;

public class FantasySolarSystem
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		
		int i = 0;  
		boolean flag = false;
		
		String SolarSystemName;
		String namePlanet;
		
		System.out.print("Enter the name of the solar system:");
		SolarSystemName = in.nextLine();
		//create a solar system object 
		SolarSystem newSolar = new SolarSystem(SolarSystemName);
		
		System.out.println("Now enter the planet names - type 'done' to finish");
		
		do
		{
			System.out.print("Enter name: ");
			namePlanet = in.nextLine();
			if (namePlanet.equalsIgnoreCase("done"))
			{
				flag = true;
			}
			else
			{
				
				double mass = rnd.nextDouble()* 100;
				double distance = rnd.nextDouble()*100;
				newSolar.addPlanet(namePlanet, mass, distance);
				System.out.print(newSolar.getNamePlanet().get(i).toString());
				i++;
			}
		}
		while ( !flag );
		
		newSolar.printTable();
	}
}