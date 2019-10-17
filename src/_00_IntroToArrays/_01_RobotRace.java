package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static //1. make a main method
	boolean haswon=false;
	public static void main(String[] args) {
		
	
		//2. create an array of 5 robots.
Robot[] racers=new Robot[19];
		//3. use a for loop to initialize the robots.
for (int i = 0; i < racers.length; i++) {
	racers[i]=new Robot();
racers[i].setY(1100);
racers[i].setX((i*100)+20);
}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
			//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

while (haswon==false) {	
advance(racers);
try {
	Thread.sleep(100);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
	 
	 }
static	void advance(Robot[] arr) {
		Random yee=new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i].setY(arr[i].getY()-yee.nextInt(10));
		if(arr[i].getY()<0) {
			haswon=true;
		}
		}
	}
}
