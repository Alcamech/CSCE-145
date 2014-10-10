/*
 * @author Lawton C Mizell
 * @Version 1.0, 30 September 2014
 * 
 *  a game where you are 
 *  an X trying to get an 
 *  ice cream cone in a mine 
 *  field
 *  
 */
import java.util.Random;
import java.util.Scanner;

public class MineWalker{
	
	enum Spaces {Empty, Player, Mine,Walked_Path, IceCream};
	public static final int BOARD_SIZE = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Keep track of the number of moves made by the player
		int numberOfMoves = 0;
		//The player's location
		int pX = 0;
		int pY = 0;
		//The ice cream location
		Random r = new Random();
		int iceX = r.nextInt(BOARD_SIZE);
		int iceY= r.nextInt(BOARD_SIZE);
		//User input
		Scanner keyboard = new Scanner(System.in);
		//Set up the board
		Spaces[][] board = new Spaces[BOARD_SIZE][BOARD_SIZE];
		//Initialize the board
		for(int y=0;y<board.length;y++)
		{
			for(int x=0;x<board[y].length;x++)
			{
				board[x][y] = Spaces.Empty;
			}
		}
		//Put the user on the board
		board[pX][pY] = Spaces.Player;
		//Puts the goal on the board
		board[iceX][iceY] = Spaces.IceCream;
		//Initializes mines
		int minecount =0; 
		int max_mines =10;
		while (minecount < max_mines) //sets mines
		{
		Random m = new Random();
		    int mX = m.nextInt(BOARD_SIZE);
		    int mY = m.nextInt(BOARD_SIZE);
			if(board[mX][mY] == Spaces.Empty)
			{
				board[mX][mY] = Spaces.Mine;
						minecount++;
			}
		}
		//introduces the program
		System.out.println("Welcome to Mine Walker.  Get the ice cream cone and avoid the mines");
		//Game over condition
		boolean gameOver = false;
		
		while(gameOver == false)
		{
			//Draw the board
			for(int y=0;y<board.length;y++)
			{
				for(int x=0;x<board[y].length;x++)
				{
					switch(board[x][y])
					{
					case Empty:
						System.out.print("_");
						break;
					case Player:
						System.out.print("X");
						break;
					case Walked_Path:
						System.out.print("_");
						break;
					case Mine:
						System.out.print("_");
						break;
					case IceCream:
						System.out.print("^");
						break;
					default:
						System.out.print("?");
					break;
					}
				}
				System.out.println(" ");
			}
			
			//The player moves
			System.out.println("Enter either -1,0,1 to move in the x or 9 to quit");
			//Movement in the X direction
			int dX = keyboard.nextInt();
			//Or quit
			if(dX == 9)
			{
				System.out.println("Game over");
				break;
			}
			System.out.println("Enter either -1,0,1 to move in the y");
			//Movement in the y direction
			int dY = keyboard.nextInt();
			
			//Checks to see if the movement is valid
			if(dX <-1 || dX>1)
			{
				System.out.println("Invalid input X");
				dX = 0;
			}
			if(dY <-1 || dY>1)
			{
				System.out.println("Invalid input Y");
				dY = 0;
			}
			
			//Sets the player position to a walked path
			board[pX][pY] = Spaces.Walked_Path;
			//Moves the player
			pX+=dX;
			pY+=dY;

			//Makes sure everything is still in bounds
			if(pX < 0)
			{
				pX = 0;
			}
			else if(pX>BOARD_SIZE-1)
			{
				pX = BOARD_SIZE-1;
			}
			if(pY < 0)
			{
				pY = 0;
			}
			else if(pY> BOARD_SIZE-1)
			{
				pY = BOARD_SIZE-1;
			}

			
			//Winning condition
			if(board[pX][pY]==Spaces.IceCream)
			{
				System.out.println("You win! The secret location was at "+iceX+" "+iceY);
				System.out.println("It took "+numberOfMoves+" moves");
				gameOver = true;
			}
			else if(board[pX][pY]==Spaces.Mine) // losing condition
			{
				System.out.println("Boom! Your Dead!");
				gameOver = true;
				System.out.println("Would you like to play again ? yes or no"); //prompts user to play again
				String answer = keyboard.next();
				if(answer.equalsIgnoreCase("yes")) //allows to play again
				{
					gameOver = false;
				}
				if(answer.equalsIgnoreCase("no")) //allows to end game
				{
					gameOver = true;
				}
			}
			//Sets the player in the new position
			board[pX][pY] = Spaces.Player;
			numberOfMoves++;
			 
		}
	}
}
