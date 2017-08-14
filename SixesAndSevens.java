package Chapter4Exercises;

import acm.program.*;

public class SixesAndSevens extends ConsoleProgram {
	
	public void run() {
		
		println("This program displays the integers between 1 and 100 "
				+ "that are divisible by 6 or 7 but not both");
		
		println("The following numbers are divisible by 6 and not 7, or "
				+ "7 and not 6");
		
	for (int i = 1; i < 100; i++) {
		if (((i % 6 == 0) && (i % 7 != 0)) || ((i % 6 != 0) && (i % 7 == 0))) {
			
			println(i);
		}
		
	}
	}

}
