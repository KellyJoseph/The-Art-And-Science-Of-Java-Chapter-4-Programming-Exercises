package Chapter4Exercises;

import acm.program.*;

public class ThisOldMan extends ConsoleProgram {
	
	public void run() {
		println("This program will generate the song, this old man, he played #, he played knick knack on my -rhyming word-");
		
		for (int i = 1; i < 11; i++) {
	
				println("This old man, he played " + i + ", he played knick knack on my ");
			
			switch (i) {
			case 1: println("thumb");break;
			case 2: println("shoe");break;
			case 3: println("knee");break;
			case 4: println("door");break;
			case 5: println("hive");break;
			case 6: println("sticks");break;
			case 7: println("heaven");break;
			case 8: println("plate");break;
			case 9: println("spine");break;
			case 10: println("shin"); break;
		
		}
	}
	}
}
