package Labs;

public class Lab4 {

	public static void main(String[] args) {
		
//		double a = 1.0;
//		double b = 2;
//		double c = 3;
//		double r1;
//		double r2;
//		double result;
//		double finalResult;
//		
//		result = (Math.pow(b, 2)-4*a*c);
//		//System.out.println(result);
//		r1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
//		r2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
//		
//		if(result == 0) {
//		System.out.println(r1);
//		}
//		else if(result > 0) {
//			System.out.println(r1);
//			System.out.println(r2);
//		}
//		else if (result < 0) {
//			System.out.println("The equation has no real roots.");
//		}
		
		double w = 21;
		double cost;
		
		if(0 < w && w <= 1) {
			cost = w*3.5;
			System.out.println(cost);
		}
		else if(1 < w && w <= 3) {
			cost = w*5.5;
			System.out.println(cost);
		}
		else if(3 < w && w <= 10) {
			cost = w*8.5;
			System.out.println(cost);
		}
		else if(10 < w && w <= 20) {
			cost = w*10.5;
			System.out.println(cost);
		}
		else if(w < 0 || w == 0) {
			System.out.println("Invalid input.");
		}
		else if(w > 20) {
			System.out.println("The package cannot be shipped");
		}

	}

}
