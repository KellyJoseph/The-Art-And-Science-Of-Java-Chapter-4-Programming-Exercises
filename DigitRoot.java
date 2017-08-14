package Chapter4Exercises;

import acm.program.*;

public class DigitRoot extends ConsoleProgram {
	
	public void run() {
		println("This program sums the digits in an integer. ");
		int n = readInt("Enter a positive integer: ");
		int dsum = 0;
		int droot = 0;
		while (n > 0) {
			dsum += n % 10;
			n /= 10;
	}
		
		while (dsum > 0) {
			droot += dsum % 10;
			dsum /= 10;
			
		}
	println("The sum of the digits is " + dsum + "the digital root is: " + droot);
}

}