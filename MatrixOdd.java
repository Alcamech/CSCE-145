/*
 * @author Lawton C Mizell
 * @Version 1.0 24 September 2014
 * 
 * Write a program that creates a random two dimensional array of integers of size specified by the user.  
 * Count the number of odd values in the array then determine  
 * the percentage of odd numbers compared to the entire array.  
 * If most of them are odd say it’s an odd matrix otherwise it is not odd.
 *  
 */
import java.util.Scanner;
import java.util.Random;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create and connect scanner object to keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//variables initialized 
		int l;
		int W;
		int mDataB;
		int mDataA;
		//random 
		Random n = new Random();
		//introduces the program
		System.out.println("Welcome to the matrix adder program!");
		//prompts user to enter first length 
		System.out.println("Please enter the length of the first matrix");
		l = keyboard.nextInt(); //takes user input
		System.out.println("Please enter the width of the first matrix");
		W = keyboard.nextInt();
		
		//creates matrices
		int first[][] = new int[l][W]; //first matrix  
		
		 System.out.println("Enter the elements of first matrix");
		 
		   for (  mDataA = 0 ; mDataA < l ; mDataA++ ) //for loop to ensure matrix one does not
		      {											  //exceed the length and width
		         for ( mDataB = 0 ; mDataB < W ; mDataB++ )
		         {
		        	
		            first[mDataA][mDataB] = n.nextInt(10);
		         }
		      }
		   
		   for (  mDataA = 0 ; mDataA < l ; mDataA++ ) //prints first matrix
		      {											
		         for ( mDataB = 0 ; mDataB < W ; mDataB++ )
		         {
		        	System.out.print(first[mDataA][mDataB]+" ");
		           
		         }
		         System.out.println("");
		      }
	      
	
	      
	      
		keyboard.close();
	}
	
}
