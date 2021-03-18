package exe8;
import exe7.Weight;
import java.util.ArrayList;
import java.util.Scanner;

public class mars{
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		Weight astronaut1 = new Weight(70);
		Weight astronaut2 = new Weight(76);
		Weight astronaut3 = new Weight(89);
		
		ArrayList<Double> weightOnMars = new ArrayList<Double>();
		
		weightOnMars.add(astronaut1.getMarsWeight(astronaut1.getWeight()));
		weightOnMars.add(astronaut2.getMarsWeight(astronaut2.getWeight()));
		weightOnMars.add(astronaut3.getMarsWeight(astronaut3.getWeight()));
		
		for (Double i : weightOnMars) {
		      System.out.println(i);
		}
	}
}
