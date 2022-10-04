package Labs;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Locale;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {


//1		
//				double number1 = (Math.random() * 100);
//				double number2 = (Math.random() * 100);
//				double number3 = (Math.random() * 100);
//				double number4 = (Math.random() * 100);
//				double number5 = (Math.random() * 100);
//				double number6 = (Math.random() * 100);
//				double number7 = (Math.random() * 100);
//				double number8 = (Math.random() * 100);
//				double number9 = (Math.random() * 100);
//				double number10 = (Math.random() * 100);
//				
//				double avg = (number1+number2+number3+number4+number5+number6+number7+number8+number9+number10)/10;
//				
//				System.out.println(avg);

//2
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("City1: ");
		String c1 = scanner.nextLine();
		System.out.print("City2: ");
		String c2 = scanner.nextLine();
		System.out.print("City3: ");
		String c3 = scanner.nextLine();
		


		String value;
		if(c1.compareTo(c2) < 0 && c2.compareTo(c3) < 0) {
			value=c1;
			c1=c2;
			c2=value;
		}
		else if(c3.compareTo(c1) < 0 && c3.compareTo(c2) < 0) {
			value=c1;
			c1=c3;
			c3=value;
		}
		if(c1.compareTo(c2) < 0) {
			value=c2;
			c2=c3;
			c3=value;
		}
		
		System.out.println(c1+" "+c2+" "+c3);
	}
}
