
/*
 * @Author Lawton C Mizel
 * @Version 1.0, 07 October 2014
 * 
 * A program that simulates a ball bouncing by computing 
 * its height in feet and each "second" as time passes on 
 * a simulated clock.
 * 
 */
import java.util.Scanner;
public class Bouncyball {
	public static void main(String[] args) {
		// create and connect scanner object
		Scanner keyboard = new Scanner(System.in);
		//introduce program
		System.out.println("Welcome to the bouncing ball program!");
		//prompts the user
		System.out.println("Please enter the initial velocity: ");
		double vel = keyboard.nextDouble(); 
		//initial variables
		double height =0;
		int bounce =0;
		int time =0;
		boolean done = false;
		while(done == false)
		{
			System.out.println("time: "+time+" "+"height: "+height); // prints time and height
			  	time++; // increases time
		        height = height + vel;
		        vel = vel - 32.0;

		        if(height < 0)
		        {
		            height = height * -0.5;
		            vel = vel * -0.5; // gravity
		            System.out.println("BOUNCE!");
		            bounce++;
		        }
		        if(bounce == 5) // test if bounce is on the 5th
				{
					done = true;
				}
			
		}
		     
		    
	}
}