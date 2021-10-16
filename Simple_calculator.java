
import java.util.Scanner;

public class Simple_calculator {
	
	private static double A;
	private static double B;
	
	
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		A = c.nextDouble();
		System.out.println("Enter the second value: ");
		B = c.nextDouble();
		
		Double Addition, Subtraction, Multiplication, Division, Modulo;
		Double firstValue= A;
		Double secondValue= B;
		
		Addition = A + B;
		Subtraction = A - B;
		Multiplication = A * B;
		Division = A / B;
		Modulo = A % B;
		
		System.out.println("Addition value: "+ Addition);
		System.out.println("Subtraction value: "+ Subtraction);
		System.out.println("Multiplication value: "+ Multiplication);
		System.out.println("Division value: "+ Division);
		System.out.println("Modulo value: "+ Modulo);
		
		
		
		
	}

}
