
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String Birthday = JOptionPane.showInputDialog("Which birthday do you want to know?");	
		// 3. Print out what the user typed
System.out.println(Birthday);		
		// 4. if user asked for "mom"
			//print mom's birthday
if(Birthday .equals ("mom's")){
	System.out.println("January 24th");	
}
		// 5. if user asked for "dad"
			// print dad's birthday
else if(Birthday .equals ("dad's")){
	System.out.println("June 9th");	
}		


// 6. if user asked for your name
			// print myBirthday
else if(Birthday .equals ("your's")){
	System.out.println("April 16th");	
}		


//7. otherwise print "Sorry, i don't remember that person's birthday!"
else{System.out.println("Sorry, i don't remember that person's birthday!"); }
	} 
}
