/*
 * @author Lawton C Mizell
 * @Version 1.0 24 September 2014
 * 
 * program that can create two matrices and then adds them!
 *  
 */
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create and connect scanner object to keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//variables initialized 
		int l;
		int l2;
		int W;
		int W2;
		int mDataB;
		int mDataA;
		
		//introduces the program
		System.out.println("Welcome to the matrix adder program!");
		//prompts user to enter first length 
		System.out.println("Please enter the length of the first matrix");
		l = keyboard.nextInt(); //takes user input
		System.out.println("Please enter the width of the first matrix");
		W = keyboard.nextInt();
		System.out.println("Please enter the length of the second matrix");
		l2 = keyboard.nextInt(); 
		System.out.println("Please enter the width of the second matrix");
		W2 = keyboard.nextInt();
		
		//creates matrices
		int first[][] = new int[l][W]; //first matrix
		int second[][] = new int[l][W]; //second matrix
		int sum[][] = new int[l][W]; //sum of matrix
		
		if(( l != l2) && ( W != W2)) //if statement to check dimensions 
		{
			System.out.println("Dimensions do not match!");
			System.exit(0);
		}
		
		 System.out.println("Enter the elements of first matrix");
		 
		   for (  mDataA = 0 ; mDataA < l ; mDataA++ ) //for loop to ensure matrix one does not
		      {											  //exceed the length and width
		         for ( mDataB = 0 ; mDataB < W ; mDataB++ )
		         {
		        	System.out.println("Please enter a value for matrix 1 space" +(mDataA+1)+" "+(mDataB+1));
		            first[mDataA][mDataB] = keyboard.nextInt();
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
	      
	      System.out.println("Enter the elements of second matrix");
	      
	      for ( mDataA = 0 ; mDataA < l2 ; mDataA++ )//for loop to ensure matrix two does not 										 
	      {											//exceed the length and width
	         for ( mDataB = 0 ; mDataB < W2; mDataB++ )
	         {
	        	System.out.println("Please enter a value for matrix 2 space"+(mDataA+1)+" "+(mDataB+1));
	            second[mDataA][mDataB] = keyboard.nextInt();
	         }
	      }
	      
	      for (  mDataA = 0 ; mDataA < l2 ; mDataA++ ) //prints second matrix 
	      {											   
	         for ( mDataB = 0 ; mDataB < W2 ; mDataB++ )
	         {
	        	System.out.print(second[mDataA][mDataB]+" ");
	           
	         }
	         System.out.println("");
	      }
	      
	      System.out.println("\t");
	      System.out.println("Sum of the entered matrices are: ");
	      
	      for ( mDataA = 0 ; mDataA < l ; mDataA++ )//for loop to ensure matrices does not 									 
	      {											//exceed the length and width
	         for ( mDataB = 0 ; mDataB < W ; mDataB++ )
	         {
	        	 sum[mDataA][mDataB] = first[mDataA][mDataB] + second[mDataA][mDataB];  //adds matrices
	        	
	   	      		System.out.print(sum[mDataA][mDataB]+" ");
	         }
	         System.out.println(" ");
	      }
	   
	      System.out.println("Done!");
	      
	      
		keyboard.close();
	}
	
}
