/*
 * @author Lawton C Mizel
 * @version 1.0 30 September 2014
 * 
 * a program that takes in any user defined
 * number values and then performs insertion 
 * sort resulting in an array of values in 
 * ascending order.
 * 
 */
import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		//create and connect scanner object to the keyboard
		Scanner keyboard = new Scanner(System.in);
		// introduces the program
		System.out.println("Welcome to the insertion sorter");
		System.out.println("Please enter the number of values you would like to sort: ");
		int size = keyboard.nextInt(); //user input values
		//declare the array
		int []number = new int[size];
		int []uNumber = new int[size];

		////populate the array with numbers the user has inputed
		for(int i=0; i < number.length; i++)
		{
			System.out.println("Please enter the number at "+i);
			number[i] = keyboard.nextInt();
			uNumber[i] = number[i];
		}
		 
	     int temp;   //temporary storage variable
	     
	     for(int i = 0; i < number.length; i++)  
	     {
	    	 temp = number[i]; //sets temp storage variable equal to index
	    	 int j = i;
	    	 while(j >0 && number[j-1] > temp)//insertion sort 
	    	 {
	    		 
	    	 number[j] = number[j-1];
	    	 j--;
	    	 
	    	 }
	    	 number[j] = temp;
	     }
	     
	    System.out.println("the unsorted array is:");
		//Print the unsorted array
		for(int i=0;i<number.length;i++)
		{
			System.out.print(uNumber[i]+" ");
		}
		System.out.println();
	    System.out.println("the sorted array is:");
		//Print the sorted array
		for(int i=0;i<number.length;i++)
		{
			System.out.print(number[i]+" ");
		}
		 
		//closes keyboard and exits program
		keyboard.close();
		System.exit(0);
	}

}
