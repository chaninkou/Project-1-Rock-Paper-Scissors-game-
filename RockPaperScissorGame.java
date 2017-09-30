package game;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display show a program that plays rock, paper, scissor
*/
public class RockPaperScissorGame 
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
	    //Declare variables
		int rock = 0;
		int paper = 1;
		int scissors = 2;
		int randomInt = 0 + (int)(Math.random() * ((2-0) + 1));
		String winner;
		
		//rock is 0, paper is 1 and scissors is 2
		System.out.println("This is a rock, paper, and scissors game!");
		System.out.println("Please use 0 as rock, 1 as paper, and 2 as scissor.\n");
		
		//prompts the user to enter a number 0, 1, or 2
		System.out.print("Enter a number 0, 1 or 2: ");
		int userChoice = in.nextInt(); 
		
		// displays a message indicating whether the user orthe computer wins, loses, or draws
		if (randomInt == scissors && userChoice == paper)  
		{
			winner = "The robot picked scissors \n" + "You loses";
		}
		else if (randomInt == rock && userChoice == scissors) 
		{
			winner = "The robot picked rock \n" + "You loses";
		} 
		else if (randomInt == paper && userChoice == rock)
	    {
			winner = "The robot picked paper \n" + "You loses";
		}
		else if (randomInt == paper && userChoice == scissors)
	    {
			winner = "The robot picked paper \n" + "You wins";
		}
		else if (randomInt == scissors && userChoice == rock)
	    {
			winner = "The robot picked scissors \n" + "You wins";
		}
		else if (randomInt == rock && userChoice == paper)
	    {
			winner = "The robot picked rock \n" + "You wins";
		}
		else
	    {
			winner = "draws";
		}
		
		//Display the results
		System.out.println("Result: " + winner);	
	} 
}