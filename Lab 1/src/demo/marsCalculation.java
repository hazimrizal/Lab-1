package demo;
import java.util.Scanner;
public class marsCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight: "); 
		Double weight = input.nextDouble();
		
		System.out.print("Your weight on Mars is " + weight/9.81 * 3.711);
		
	}

}
