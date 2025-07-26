package cse;
import java.util.Scanner;
class ArithmeticOperators {
	  public static void main(String[] args) {
	    int a,b;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Type a number:");
	    a = sc.nextInt(); 
	    System.out.println("Type another number:");
	    b = sc.nextInt();
	    System.out.println("a + b = " + (a + b));
 
	    System.out.println("a - b = " + (a - b));

	    System.out.println("a * b = " + (a * b));

	    System.out.println("a / b = " + (a / b));

	    System.out.println("a % b = " + (a % b));
	  }
	}
