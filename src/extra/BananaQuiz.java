//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
	if(banana .equals("no")) {		
	JOptionPane.showMessageDialog(null, "You are crazy");	
		
		//tell them they are crazy 
			//and end quiz
	System.exit(0);
	}		
		//3. if they say yes
	else	if(banana .equals("yes")) {
		//	ask them what is their favorite hobby
	String hobby =JOptionPane.showInputDialog("What is you favorite hobby?");		
		//	show a pop up that says "<your hobby> is much better with bananas!"
	JOptionPane.showMessageDialog(null, hobby+" is much better with bananas");
		//4. OPTIONAL: if they say something other than â€œyesâ€? or â€œnoâ€?
		//	show a pop up that says â€œYou are bananas!â€?
	}
	else {JOptionPane.showMessageDialog(null, "You are bananas!");
	}
}
}

