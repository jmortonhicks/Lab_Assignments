package Labs;

public class Lab6 {

	public static void main(String[] args) {
// 1	
//		double x1=3;//center coordinates
//		double y1=2;
//		double radius = 5;
//		
//		double x2=8;//user inputed numbers
//		double y2=0;
//		double distance;
//		
//		distance = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
//		System.out.println(distance);
//		
//		if (distance > radius)
//			System.out.println("Point " + "("+x2+","+y2+")"+" is not in the circle.");
//		else
//			System.out.println("Point " + "("+x2+","+y2+")"+" is in the circle.");
// 2
		double n = 5;
		double s = 6.5;
		double area;
		
		area = ((n*Math.pow(s, 2))/(4*Math.tan((Math.PI)/n)));
		System.out.println(area);
	
	
	
	}

}
