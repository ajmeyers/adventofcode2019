/*
 * --- Day 1: The Tyranny of the Rocket Equation ---
 */

public class Day1 {
	
	public static void main(String args[]) {
		
		int[] modules = new int[] {90014,136811,76785,52456,100165,145455,139492,
				                  147364,132728,148120,125346,70660,93908,65560,
				                  117553,82640,102895,52255,92105,131486,108400,
				                  50206,143776,125140,85110,99560,132357,114882,
				                  54894,97524,92970,96947,90800,77099,105103,66349,
				                  88495,105036,141694,125727,84853,138364,65577,
				                  148012,79944,96503,119701,66221,72469,93647,
				                  78767,56419,53435,77682,122753,144944,54835,
				                  57744,131886,101510,113730,94631,132978,
				                  132739,64250,125158,89069,112371,95739,93349,
				                  78558,135082,132015,144682,62515,59722,70175,
				                  82703,65827,78405,125701,94987,70914,62543,
				                  130058,83997,133749,62224,116328,120760,118160,
				                  76755,64521,109956,113248,141473,100546,74991,53223,147635};
		
		int sumOfFuelRequirements = fuelCounterUpper(modules);
		System.out.println(sumOfFuelRequirements);
	}
	
	public static int fuelCounterUpper(int[] arr) {
		int fuelSum = 0;
		int totalFuelSum = 0;
	
		for (int i = 0; i < arr.length; i++) {
			
			int sum = Math.floorDiv(arr[i], 3) - 2;
			while (sum > 0) {
				
				fuelSum = fuelSum + sum; 
				sum = (Math.floorDiv(sum, 3) - 2);
		
			}
			totalFuelSum = totalFuelSum + fuelSum;
			fuelSum = 0;
		}

		return totalFuelSum;
	}
}
