import java.util.Scanner;
import java.util.*;

public class AmbicableHappy {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n***** Copyright Sushil 2021 *****\n\n");
        System.out.println("::Welcome to Amicable-Happy Game::\n");

	
	while(true) {
		System.out.println("\n --> To check Amicable Number, Enter \'A\'");
		System.out.println(" --> To check Happy Number, Enter \'H\'");
		System.out.println(" --> To Exit, Enter \'E\'");
			
		System.out.println("\nEnter your choice::");
		String choice = scan.next();//accept user input

		switch(choice){
			case "a":
			case "A": System.out.println("\n********* AMBICABLE NUMBER *********\n");
			          System.out.print("Enter 1st number = ");
			          int a = scan.nextInt(); // input first number
			          System.out.print("Enter 2nd number = ");
			          int b = scan.nextInt(); // input second number
			
			          int sumA = 0, sumB = 0; // storing the sum of factors of both the number
			
			          for(int i = 1; i <= a; i++)
				  {
					  if (a%i == 0) sumA += i;  // sum of factor of first number
				  }
			          for(int i = 1; i<=b; i++)
			         {
					  if(b%i == 0) sumB += i; // sum of factor of second number
			         }
			
			         if (sumA == sumB) {
					 System.out.print("\n----------------------------------------------------\n");
                                         System.out.print("Result:- The numbers are AMICABLE Number.");
                                         System.out.println("\n----------------------------------------------------");
                                         System.out.println("\n\n------> PLAY ONCE AGAIN !!   <--------\n");
				 } else
				 {
					 System.out.println("\n----------------------------------------------------\n");
                                         System.out.println("Result:- The numbers are not AMICABLE Number.");
                                         System.out.println("\n----------------------------------------------------");
                                         System.out.println("\n\n ------> PLAY ONCE AGAIN !!   <--------\n");
				 }
			break;
			case "h":
			case "H": System.out.println("\n********* HAPPY NUMBER *********\n");
			          System.out.print("Enter a number = ");
			          int num = scan.nextInt(); // input the number
            
                                  Set<Integer> unique_num = new HashSet<Integer>();

                                  while (unique_num.add(num))
				  {
					  int value = 0;
					  while (num > 0)
					  {
						  value += Math.pow(num % 10, 2);
						  num /= 10;
					  }
					  num = value;
				  }
            
                                 if (num == 1) {
					 System.out.print("\n----------------------------------------------------\n");
                                         System.out.print("Result:- The number is HAPPY Number.");
                                         System.out.println("\n----------------------------------------------------");
                                         System.out.println("\n\n------> PLAY ONCE AGAIN !!   <--------\n");
				 } else {
					 System.out.print("\n----------------------------------------------------\n");
                                         System.out.print("Result:- The number is not HAPPY Number.");
                                         System.out.println("\n----------------------------------------------------");
                                         System.out.println("\n\n------> PLAY ONCE AGAIN !!   <--------\n");
				 }
			break;
			case "e":
			case "E": System.out.println("Exiting the application");
			          System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}

	}

}
