package com.Number.Game;
import java.util.*;


public class NumberGame {
	
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		boolean playGame = true;
		
		while(playGame)
		{
			int min =1;
			int max=100;
			int attempt =3;
			int RandomNumber = r.nextInt(max-min+1)+min;
			boolean guess = false;
			int score=5;
			
			System.out.println("Welcome to the Number Game.");
			System.out.println("The Random number has been picked from "+ min + " to "+ max);
			System.out.println("You Will have 3 attempts to guess the number");
			System.out.println("If you guess on the first attempt you will get 5 point, on second attempt you will get 3 points, on third attempt you will get 1 point ");
			System.out.println("On 3 unscuessful attempts you will get 0 points\n \n");
			System.out.println("****************************************************************************************************************************************************\n\n");
			
			while(attempt>0 && !guess)
			{
				System.out.println("Enter your Number");
				int  number = s.nextInt();
				attempt--;
				
				if(number < RandomNumber)
				{
					System.out.println("Too low!!! Try again");
					score-=2;
				}
				else if(number > RandomNumber)
				{
					System.out.println("Too high!!! Try again");
					score-=2;
				}
				else 
				{
					System.out.println("Bingo!! You guessed it right\n\n");
					guess = true;
				}
			}
			
			if(!guess)
			{
				System.out.println("\nSorry you have used all your attempts...");
				System.out.println("The correct number was "+ RandomNumber);
			}
			if(score == -1)
			{
				score =0;
			}
			System.out.println("Your Score is "+ score);
			System.out.println("\n\n ******************************************************************************************************************************************************\n\n");
			
			System.out.println("Do you want to play again?(Yes/No)");
			playGame = s.next().equalsIgnoreCase("yes");
							
			
		}
		System.out.println("Thank you!!");
		s.close();
		
	}

}
