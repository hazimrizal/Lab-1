package exe7;
import java.util.Scanner;
public class Weight {
	
	double weight; 
	
	public Weight(double Weight){
		setWeight(Weight);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getMarsWeight(double weight)
	{
		return  (weight/9.81) * 3.711;
	}
	
	/*public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight: "); 
		Double weight = input.nextDouble();
		
		System.out.print("Your weight on Mars is " + getMarsWeight(weight));
		
	}*/
	

}	
