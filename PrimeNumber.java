import java.util.Scanner;

public class PrimeNumber {

	 public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       String  primeNumbers = "";
	       Scanner scan = new Scanner(System.in);
	       System.out.print("Input number : ");
	       int number = scan.nextInt();

	       for (i = 1; i <= number; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers : " + primeNumbers);
	   }
	}