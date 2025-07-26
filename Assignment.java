package cse;
import java.util.Scanner;
public class Assignment {
  public static void main(String[] args) {
       int a;
          Scanner sc= new Scanner(System.in);
          System.out.println("Type a number:");
          a = sc.nextInt();
          int var=a;
         
          System.out.println("var using =: " + var);

          var += a;
          System.out.println("var using +=: " + var);

          var *= a;
          
          System.out.println("var using *=: " + var);
        }
}