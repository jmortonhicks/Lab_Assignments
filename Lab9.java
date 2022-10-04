package Labs;

import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String format = "(000) 000-000";
		String phone;
		
		System.out.println("Enter telephone number(10 digits): ");
		phone = scanner.next();
		
		String.format("%() - s", phone);
		System.out.println(phone);
		
	}

}
