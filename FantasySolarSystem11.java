	/* A program that needs the name of SolarSystem and the names of planets and then 
	give the mass the distance and calculate the period of that planets until we
	     put done */
	import java.util.Scanner;
	import java.util.Random;

	public class FantasySolarSystem
	{
		public static void main (String [] args)
		{
			//Here are all the values 
			//that we need in our program 
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
		
			// a message that wants the name of planets or done
			System.out.println("Now enter the planet names - type 'done' to finish");
		
			// a loop that check if the name is equal to done 
			// if is not then it will calculate the mass, and the distance of planet 
			// and it will call the method and then it will print the values in ArrayList
			// that we create 
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
			
			//it will print the table of this object		
			newSolar.printTable();
		}
	}