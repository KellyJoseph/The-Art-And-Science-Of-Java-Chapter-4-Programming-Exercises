package Chapter4Exercises;

import acm.program.*;

public class ReverseNumber extends ConsoleProgram {
	
	public void run() {
		
		println("This program reads a number, then reverses it");
		
		int num = readInt("Enter any positive number");
		
		int rem = 0;
		int tot = 0;
		
		while ( num > 0 ){
		
			rem = num % 10;
			tot =  ((tot*10) + rem);
			/*for int 321
			 *  loop 1, tot = tot(0) x 10 + 1 = 1
			 *  loop 2, tot = tot (1) x 10 + 2 = 12
			 *  loop 3, tot = tot (12) x 10 + 3 = 123			 */
			num /= 10;
			
			
			
		}
			println("The reverse digit order is: " + tot);
		}
	}

