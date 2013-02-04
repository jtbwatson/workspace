package hw3p2;

public class RainFall {
	
	public double[] yearRainFall;
	private double totalRainfall;
	private double averageRainfall;
	private double maxRain;
	private double minRain;
	
	public RainFall(double[] rainfall) {
		
		final int lengthOfRainfall = rainfall.length;
		
		double[] rainFallFromMain = new double [lengthOfRainfall];
		
		for(int x = 0; x < lengthOfRainfall; x++) {
			rainFallFromMain[x] = 0;
		}
		
		for(int x = 0; x < rainfall.length; x++) {
			rainFallFromMain[x] = rainfall[x];
		}
		
		yearRainFall = rainFallFromMain;
		
	}
	
	public double totalRainfall() {
		
		totalRainfall = 0.0;
		
		for(int x = 0; x < yearRainFall.length; x++) {
			totalRainfall += yearRainFall[x];
		}
		
		return totalRainfall;
		
	}
	
	public double averageRainfall() {
		
		averageRainfall = 0.0;
		double temp = 0.0;
		
		for(int x = 0; x < yearRainFall.length; x++) {
			temp += yearRainFall[x];
		}
		
		averageRainfall = temp / yearRainFall.length;
		
		return averageRainfall;
		
	}
	
	public double maxRain() {
		
		maxRain = 0.0;
		
		for(int x = 0; x < yearRainFall.length; x++) {
			if(yearRainFall[x] > maxRain) {
				maxRain = yearRainFall[x];
			}
		}
		
		return maxRain;
		
	}
	
	public double minRain() {
		
		minRain = 0.0;
		
		//find the maximum value of the array
		for(int x = 0; x < yearRainFall.length; x++) {
			if(yearRainFall[x] > minRain) {
				minRain = yearRainFall[x];
				//and compare it to the other ones, finding the lowest value
				//reason being that if you don't do this, minRain will always be 0.0 since that's
				//the lowest acceptable value to input and we initialize minRain at 0.0
				for(int y = 0; y < yearRainFall.length; y++) {
					if(yearRainFall[y] < minRain) {
						minRain = yearRainFall[y];
					}
				}
			}
		}
		
		return minRain;
		
	}
	
	

}