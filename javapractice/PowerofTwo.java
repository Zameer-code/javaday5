package javapractice;

import java.util.Iterator;
import java.util.Scanner;

public class PowerofTwo {
	private static final String userInput = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number between 0 to 31");
		int userInput = scanner.nextInt();
		if (userInput < 0 && userInput > 31) {
			System.out.println("Please enter Valid input");
		} else {
		  printTable(userInput);
		  	
		}
	}

	private static void printTable(int userInput) {
		for (int i = 0; i < userInput; i++) {
			System.out.println(Math.pow(2, i));
		}
		
	}

}
