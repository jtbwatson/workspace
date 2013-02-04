package hw3p1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int rows = 0;
		int cols = 0;
		
		
		System.out.println("How many rows do you want?");		
		rows = scan.nextInt();
		System.out.println("How many cols do you want?");
		cols = scan.nextInt();
		
		double [][] arrayInitial = new double[rows][cols];
		
		System.out.println("Enter the values for each cell of the two dimensional array.\n" +
				"You will start at cell [0,0] and work your way through the row until you\n" +
				"complete the row (0, " + cols + ") you will be bumped to the next row.");
		
		for(int x = 0; x < rows; x++) {
			for(int y = 0; y < cols; y++) {
				
				arrayInitial[x][y] = scan.nextDouble();
				
			}
		}
		
		for(int x = 0; x < rows; x++) {
			for(int y = 0; y < cols; y++) {
				System.out.print(arrayInitial[x][y] + "\t");
				
				if(y == cols - 1) {
					System.out.println();
				}
			}
		}
		
		System.out.println();
		
		MyExcel arrayFinal = new MyExcel(arrayInitial);
		
		arrayFinal.getExcel();
				
		System.out.println("Let's add up the values of each row and column.\n" +
				"Which row would you like to add together?");
		
		int row = scan.nextInt() - 1;
		
		System.out.println("Now which column would you like to add together?");
		
		int col = scan.nextInt() - 1;
		
		arrayFinal.rowTotal(row);
		arrayFinal.colTotal(col);
				
		double rowTot = arrayFinal.rowTotal(row);
		double colTot = arrayFinal.colTotal(col);
		
		System.out.println("The total for row " + row + " is " + rowTot + ".");
		System.out.println("The total for column " + col + " is " + colTot + ".");
		
		System.out.println("The completed table looks like this.");
		
				
		arrayFinal.completeTable();
		
		
				
	}
}
