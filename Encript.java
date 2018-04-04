/*Raynier Leroux
 * Encription for Caesar Cipher
 */
import java.util.Random; 

public class Encript {
	//Privates
	private static Random rand = new Random();
	
	//Publics
	public static int shift = rand.nextInt(25) + 1;
	public static String EString = "";
	
	//Methods
	public static String Encription(String input) {
		
		String Original = input;
	
		for(int i = 0; i < Original.length();i++) {
			char P = Original.charAt(i);
			
			if(P == ' ') {
				EString += ' ';
			} // IF
			else {
				
				if(Character.isUpperCase(Original.charAt(i))) {
					P = (char)(((int)Original.charAt(i) + shift - 65) % 26 + 65);
					EString += P;
				} // IF
				else {
					P = (char)(((int)Original.charAt(i) + shift - 97)% 26 + 97);
					EString += P;
				} // ELSE
			} // Outer Else
			
		}
		
		System.out.println("Shift: " + shift);
		return EString.toUpperCase();
		
	}
}
