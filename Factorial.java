import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Please input Number Factorial : ");
      int result = 1;
      int n = scan.nextInt();

      for (int i = n; i >= 1; i--) {
         result *= i;
      }
      System.out.println("Result of Factorial = " + result);
   }
}