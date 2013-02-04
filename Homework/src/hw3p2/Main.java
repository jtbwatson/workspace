package hw3p2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] rainFall = new double[12];
		
		System.out.println("You're going to enter 12 double values representing\n" +
				"the amount of rainfall for each month. The program will then\n" +
				"calculate the total amount of rainfall, the average amount of\n" +
				"rainfall, and finally the maximum and minimum amounts of rain\n" +
				"for the given year.");
		
		System.out.println("\nStart by entering in twelve double values.");
		
		for(int x = 0; x < 12; x++) {
			rainFall[x] = scan.nextDouble();
			if(rainFall[x] < 0) {
				System.out.println("You cannot enter a negative value. Enter a positive value.");
				rainFall[x] = scan.nextDouble();
			}
		}
		
		RainFall thisYear = new RainFall(rainFall);
		
		System.out.println("Now we're going to calculate the total rainfall that you entered" +
				"for this year.");
		
		System.out.println("The total amount for this year is " + thisYear.totalRainfall());
		
		System.out.println("Now let's see what the average is.");
		
		System.out.println("The average rain fall for this year is " + thisYear.averageRainfall());
		
		System.out.println("Do you want to find the maximum or the minimum amount of rainfall first?" +
				"\nType \"max\" for the maximum and \"min\" for the minimum.");
		
		String choice = scan.next();
		
		
		switch(choice) {
			case "max":
				System.out.println("The maximum value is " + thisYear.maxRain());
				break;
				
			case "min":
				System.out.println("The minimum value is " + thisYear.minRain());
				break;
				
			default:
				System.out.println("That is not an acceptable answer. Terminating Application.");
			}
		
		System.out.println("\nYAY! We did it!");
		
	}

}
