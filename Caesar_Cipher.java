/* Raynier Leroux 
 * Caesar Cipher
 * 
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Caesar_Cipher extends Encript{
	

	public static void main(String[] args)	{
		
		CaesarSalad();
		
	}
	
	public static void CaesarSalad() {
		
		//Font LabelFont = new Font("SansSerif", Font.PLAIN, 30);
		
		JFrame CaesarsHead = new JFrame();
		Caesar_GUI(CaesarsHead);
		CaesarsHead.setVisible(true);
		CaesarsHead.setSize(1800,500);
		// Setting location relavtive to users screen size
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		CaesarsHead.setLocation(dim.width/2-CaesarsHead.getSize().width/2, dim.height/2-CaesarsHead.getSize().height/2);
		CaesarsHead.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CaesarsHead.setResizable(false);
		
		// Icon Retrieving and Setting
		ImageIcon img = new ImageIcon("D:\\Eclipse\\Caesar Cipher//Dressing.jpg");
		CaesarsHead.setIconImage(img.getImage());
		
		CaesarsHead.setTitle("Caesar Cipher");
		CaesarsHead.getContentPane().setBackground(Color.WHITE);
		CaesarsHead.getContentPane();
	
		
	}
	/**
	 * @param F
	 */
	public static void Caesar_GUI(JFrame F){
        
		JTextField input, output, Shift;
		JButton E,D;
		
		//Fonts
		Font font1 = new Font("SansSerif", Font.PLAIN, 30 );
		
		// .setBounds( x , y , Width , Height)
		
		F.setLayout(null);
		
		//input Text box
        input = new JTextField(30);
        input.setBounds(300,15,1300,100);
        input.setFont(font1);
     
        F.add(input);
        
        // Shift text box
        Shift = new JTextField(10);
        Shift.setBounds(215,203,45,80);
        Shift.setFont(font1);
        F.add(Shift);
        
        // Encripyt Textbox
        output = new JTextField(30);
        output.setBounds(300,200,1300,100);
        output.setFont(font1);
        F.add(output);
         
        //Encripyt Button
        E = new JButton("Encripyt");
        E.setBounds(300,120,650,70);
        E.setFont(font1);
        E.addActionListener(new ActionListener() {
        	
        	// ACTIONS when Encrypt button is clicked
			@Override
			public void actionPerformed(ActionEvent e) {
				if(output.getText() != null) {
				Shift.setText(null);
				output.setText(null);
				} // END IF
				Shift.setText(String.valueOf(shift));
				Encript.Encription(input.getText());
				output.setText(EString.toUpperCase());
				input.setText(null);
			}
        	
        	
        });
        F.add(E);
        
        //Decrypt Button
        D = new JButton("Decrypt");
        D.setBounds(949,120,650,70);
        D.setFont(font1);
        D.addActionListener(new ActionListener(){
         	// ACTIONS when Encripyt button is clicked
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(null);
				output.setText(Decypt.Decryption(input.getText(),Shift.getText()));
				
			}
        	
        	
        });
        F.add(D);
        
  }

}
