/* Raynier Leroux
 * Decriptor for Caesar Cipher
 */
public class Decypt extends Encript{
	
	public static String Decryption(String Encrypted, String Shift) {
		
		int Shif = Integer.parseInt(Shift);
		System.out.println(Shif);
		String solved = "";
		System.out.println("Shift: " + Shift);
		
		System.out.println(Encrypted.length());
		// Encript.shift
		for (int i = 0; i < Encrypted.length(); i++) {
			char C = Encrypted.toUpperCase().charAt(i); 	
			if(C == ' ' ) {
				System.out.print(" ");
				solved += C;
				} // END IF
			else {
					C = (char)(((int)C - Shif + 65) % 26 + 65);
					System.out.print(C);
					solved += C;
				} // END Else
			
		} // End For
		
		return solved;
		
	}  // End of Method
	
} // End of file