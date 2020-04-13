import java.util.Scanner;
public class Testprogram
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the name of the solar system:");
		SolarSystemName = in.nextLine();
		System.out.println("Enter the planet names - type "done" to finish");
		nameplanet = in.nextLine();
		
		while (SolarSystemName.!equalsIgnoreCase("done"))
		{
			
			
			