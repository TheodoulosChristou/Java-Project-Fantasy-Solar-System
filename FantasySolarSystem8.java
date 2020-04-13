import java.util.Scanner;
public class FanstasySolarSystem
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the name of the solar system:");
		SolarSystemName = in.nextLine();
		System.out.println("Enter the planet names - type "done" to finish");
		nameplanet = in.nextLine();
		boolean flag = true;
		
		do
		{
			if (nameplanet.equalsIgnoreCase("done")
			{
				flag = false;
			}
			else
			{
				System.out.println("Enter name:");
				String nameplanet =in.nextLine();
				double mass = rnd.nextDouble;
				double distance = rnd.nextDouble;
				nextplanet.addPlanet(name, mass, distance);
			}
		}
		while (flag = true);
		
		System.out.println();
		nextplanet.printTable();