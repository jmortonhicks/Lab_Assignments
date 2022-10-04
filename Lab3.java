package Labs;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		
		double celsius;
		double result;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celsuis: ");
		celsius = scanner.nextDouble();
		
		result = (9.0/5)*celsius+32;
		System.out.println(result+ " degrees Fahrenheit.");
		double finalT = 10.5;
		double intialT = 3.5;
		double M = 55.5;
		double Q;
		
		Q = M*(finalT-intialT)*4184;
		System.out.println(Q);
		
	}

}
