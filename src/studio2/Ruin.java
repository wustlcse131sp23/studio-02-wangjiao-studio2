package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The start amount of money: " );
		double startAmount = in.nextDouble();
		System.out.println("The win probability: " );
		double winChance = in.nextDouble();
		System.out.println("The win limit: " );
		double winLimit = in.nextDouble();
		System.out.println("Total simulations " );
		int totalSimulations = in.nextInt();
		int simulation;
		int loss = 0; 
		for (simulation = 1; simulation<=totalSimulations;simulation++)
		{
			int count = 0;
			double amount = startAmount;
			while (amount > 0 && amount < winLimit)
			{
				if  (Math.random() >= winChance)
				{			
					amount ++;
					count ++;
				}
				else
				{		
					amount --;
					count ++;
				}
			}
			if (amount >= winLimit)
			{
				System.out.println("Simulation "+simulation+ ": " + count+ " WIN. ");
			}
			else
			{
				loss++;
				System.out.println("Simulation "+simulation+": "+count+" LOSE. ");
			}
		}
		
		
	}
}
