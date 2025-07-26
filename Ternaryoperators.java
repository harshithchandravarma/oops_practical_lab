package cse;
import java.util.Scanner;
class Ternaryoperators {
	  public static void main(String[] args) {

	    int februaryDays;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Type a number:");
	    februaryDays = sc.nextInt(); 
	    String result;
	    result = (februaryDays== 28) ? "Not a leap year" : "Leap year";
	    System.out.println(result);
	  }
	}
