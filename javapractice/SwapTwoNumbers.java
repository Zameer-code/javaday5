package javapractice;

import java.util.Scanner;

public class SwapTwoNumbers {
 public static void main(String[] args) {
	 int num1, num2, swap;
     Scanner scanner = new Scanner(System.in);
		
     System.out.print("Enter Two Number : ");
		
     System.out.print("\nFirst Number : ");
     num1 = scanner.nextInt();
     System.out.print("Second Number : ");
     num2 = scanner.nextInt();
		
     swap = num1;
     num1 = num2;
     num2 = swap;
		
     System.out.print("The Value of the First and Second Number after Swapping is \n");
		
     System.out.print("First Number = " +num1);
     System.out.print("\nSecond Number = " +num2);
         
	     
 	}
}
