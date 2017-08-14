package Chapter4Exercises;

import acm.program.*;

public class FibonacciNumbersUpToTenThousand extends ConsoleProgram {
	
	public void run() {
		
		println("This program uses a while loop to generate the sequence of Fibonacci numbers"
				+ "Fibonacci numbers are equal to the current number and the precesing number");
		int prevnum = 1;
		int prevprevnum = 0;
		
		for (int currentnum = 0; currentnum < NUMBER;  currentnum++) {
			
			
			println("prevprev is : " + prevprevnum);
			println("prevnum is : " + prevnum);
			
				
				currentnum = prevnum + prevprevnum;
				
				if (currentnum > 10000) break;
				
				println("current number is : " + currentnum + ".");
				
				
				prevprevnum = prevnum;
				prevnum = currentnum;
	}
	}
	private static final int NUMBER = 9999;
}
