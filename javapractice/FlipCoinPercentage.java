package javapractice;

import java.util.Scanner;

public class FlipCoinPercentage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of times to flip the coin");
		int flipCount = scanner.nextInt();
		int headCount = 0;
		int tailCount = 0;
		for (int i = 0; i < flipCount; i++) {
			double random = Math.random();
			if (random > 0.5) {
				headCount++;
			} else {
				tailCount++;
				
			}
		}
		System.out.println(
		"HeadCount is : " + headCount + " % = " + calculatepercentage(flipCount, headCount));
		System.out.println(
		"TailCount is : " + tailCount + " % = " + calculatepercentage(flipCount, tailCount));
 }
	
	private static double calculatepercentage(int flipCount, int count) {
		return (double) count / flipCount * 100;
		
	}
}	
