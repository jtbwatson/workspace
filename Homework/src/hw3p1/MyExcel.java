package hw3p1;

public class MyExcel {
	
	
	public double[][] excel;
	public double rowTotal;
	public double colTotal;
	
	public MyExcel(double [][] table) {
		// declare constants for the number of rows and columns
		final int numRows = table.length;
		
		int maxRow = 0;
		
		for(int n = 0; n < numRows; n++){
			
			if(maxRow < table[n].length) {
				
				maxRow = table[n].length;
			}
		}
		
		final int numCols = maxRow;
		
		//declare and instantiate the array
		double [][] excelTable = new double [numRows][numCols];
		
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				excelTable [i][j] = 0;
			}
		}
		
		
		for(int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				excelTable [i][j] = table[i][j];
			}
		}
		
		excel = excelTable;
		
	}
	
	
	
	
	
	public double[][] getExcel() {
		
		double[][] a = excel;
		return a;
		
	}
	
	public double rowTotal(int row) {
		
		rowTotal = 0.0;
		
		for(int x = 0; x < excel[row].length; x++) {
			rowTotal += excel[row][x];
		}
		
		return rowTotal;
		
	}
	
	public double colTotal(int col) {
		
		colTotal = 0.0;
		
		for(int x = 0; x < excel.length; x++) {
			colTotal += excel[x][col];
		}
		
		return colTotal;
		
	}

	
	public void completeTable() {
		
		for(int x = 0; x < excel.length; x++) {
			for(int y = 0; y < excel[x].length; y++) {
				System.out.print(excel[x][y] + "\t");
				
				if(y == excel[x].length - 1) {
					System.out.println();
				}
			}
		}
		
	}
	

}
