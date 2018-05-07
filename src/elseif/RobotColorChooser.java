//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
Robot tacos = new Robot();		
		//3. Ask the user what color they would like the robot to draw
String color = JOptionPane.showInputDialog("What pen color would you like");		
		//5. Use an if/else statement to set the pen color that the user requested
if(color .equals ("red")){
	tacos.setPenColor(Color.RED);
}
else if(color .equals ("orange")){
	tacos.setPenColor(Color.ORANGE);
}
else if(color .equals ("yellow")){
	tacos.setPenColor(Color.YELLOW);
}
else if(color .equals ("green")){
	tacos.setPenColor(Color.GREEN);
}
else if(color .equals ("blue")){
	tacos.setPenColor(Color.BLUE);
}
else if(color .equals ("purple")){
	tacos.setPenColor(Color.MAGENTA);
}
//6. If the user doesn’t enter anything, choose a random color
else{
	tacos.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
tacos.setPenWidth(10);		
	    //2. Make the robot draw a shape (this will take more than one line of code)
tacos.penDown();
tacos.setSpeed(100);
for(int x = 0; x<4; x++){
tacos.move(100);
tacos.turn(90);
	}
}
}