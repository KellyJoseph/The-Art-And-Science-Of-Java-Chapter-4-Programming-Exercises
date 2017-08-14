package Chapter4Exercises;

import acm.program.*;
public class ReverseNum extends ConsoleProgram {
public void run(){
 println("This program reverses the digit in an interger.");
 int num=readInt("Enter a positive integer: ");
 int dnum=0;
 int snum=0;
 while(num > 0)
 {
  dnum *=10;
  snum=num%10;
  dnum=dnum+snum;
  num=num/10;
  
 }
 println("The reversed number is" + dnum);
}

}