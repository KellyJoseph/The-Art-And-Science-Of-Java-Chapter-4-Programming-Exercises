package Chapter4Exercises;

import acm.program.*;

public class NinetyNineBottlesOfBeer extends ConsoleProgram {
	
public void run() {
	
	println("This program procedurally generates the lyrics to 99 bottles of beer");
	
	for (int i = BOTTLES; i >= 1; i--) {
		println(i + "bottles of beer on the wall, " + i + " bottles of beer, "
				+ "take one down, pass it around, " + (i-1) + "bottles of beer on the wall");
	}
	println("song is over");
}
	private static final int BOTTLES = 100;
	
}
