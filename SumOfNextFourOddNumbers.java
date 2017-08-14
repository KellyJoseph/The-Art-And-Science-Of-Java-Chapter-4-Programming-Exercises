package Chapter4Exercises;

import acm.program.*;

public class SumOfNextFourOddNumbers extends ConsoleProgram {

	public void run(){
	
		println("This program reads an integer, finds the next N/2 number of "
				+ "odd integers, then adds them together");
		
		// N is multiplied by 2 because only ever second integer will be uneven
		
	int N = readInt("Enter an integer: ");
	
	int total = 0;	
	for (int i = 0; i < (N*2); i++) {
		if(i%2 != 0){
			
			total += i;
			
			println(total);
		}
		
	}
		
	}
}