package Labs;

public class Lab7 {

	public static void main(String[] args) {
// 1
//		int randomNumber = (int) (Math.random()*27);
//		
//		String alphabet = "abcdefghijklmnopqrstuvwxyz";
//		System.out.println(Character.toUpperCase(alphabet.charAt(randomNumber)));
// 2
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);
        int num4 = (int)(Math.random() * 10);
        
        int char1 = (int) (Math.random() * 27);    
        int char2 = (int) (Math.random() * 27);    
        int char3 = (int) (Math.random() * 27);    

        System.out.printf("%s%s%s%d%d%d%d%n", 
        	letters.charAt(char1),
        	letters.charAt(char2),
        	letters.charAt(char3),
        	num1,num2,num3,num4);
        
        System.out.print(letters.charAt(char1));
        System.out.print(letters.charAt(char2));
        System.out.print(letters.charAt(char3));
        System.out.print(num1);
        System.out.print(num2);
        System.out.print(num3);
        System.out.print(num4);
	}

}
