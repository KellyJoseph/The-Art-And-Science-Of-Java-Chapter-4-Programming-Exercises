package Chapter4Exercises;

import acm.program.*;

public class AverageList extends ConsoleProgram {
	
	public void run() {
		
	
	println("This program reads a list of integers, "
			+ "then prints the average. Use -1 as the "
			+ "sentinel since 0 may be a test score.");
	
			int total = 0;
			int count = 0;
		
			
			
			while (true) {
	
				int value = readInt("enter any number");
				if (value == SENTINEL) break;
				total += value;
				count++;
				
			}
			
			double average = total/count;
			println("The average test score is: " + average);
				
			}
			private static int SENTINEL = -1;
				
			}
