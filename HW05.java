/*
 * @author Lawton C Mizell
 * @version 1.0
 * 
 * a program that accepts a string and then determines whether or not  * it is a palindrome.
 */
import java.util.Scanner;

public class HW05{
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a word or phrase and i`ll tell you if it's a palindrome.");
		String word = keyboard.nextLine();
		String nword = word.replaceAll("\\s", "");

		String rWord = new StringBuffer(nword).reverse().toString();
		if(nword.equalsIgnoreCase(rWord))
		{
			System.out.println(word+" is a palindrome!");
		}
		else
		{
			System.out.println(word+" is not a palindrome!");
		}

	}
}