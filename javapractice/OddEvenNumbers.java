package javapractice;

import java.util.Scanner;

public class OddEvenNumbers {
	public static void main(String[] args) {
        //create a scanner to read bytes from console entered by user via keyboard
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Enter a number : ");
        //read integer from user
        int a = scanner.nextInt();
         
        //check if the number is even or odd
        if(a%2==0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
         
        //close the scanner
        scanner.close();
    }

}
