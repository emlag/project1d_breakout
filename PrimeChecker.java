/*
 * File: PrimeChecker.java
 * -----------------------------
 * Checks whether a series of numbers are prime
 */

import acm.program.*;

public class PrimeChecker extends ConsoleProgram {
	
	int[] testCases = {2, 3, 8, 37,  42, 87, 361, 382, 729, 1019};
	bool[] answers = {true, true, false, true, false, false, false, false, false, true};
	
	public void run() {	
		for (int i = 0; i < testCases.length; i++) {
			int testCase = testCases[i];
			
		}
	}
	
	/**
	 * 
	 * @param n a positive integer greater than 1
	 * @return true if n is prime and false otherwise
	 */
	private boolean isPrime(int n) {
		
		return true; // this is only here so the program compiles
	}


}
