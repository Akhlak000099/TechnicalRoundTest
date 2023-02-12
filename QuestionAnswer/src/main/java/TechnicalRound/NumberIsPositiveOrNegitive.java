package TechnicalRound;

import java.util.Scanner;

public class NumberIsPositiveOrNegitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		System.out.println("Enter a number for check the number is positive or negititve");
		int n=ch.nextInt();
		
		if(n>=0) {
			if(n==0) {
				System.out.println("your number is zero "+n);
			}
			else {
				System.out.println("Your number in Positive " +n);
			}
			
		}
		else {
			System.out.println("Your number in negitive "+n);
		}
	}

}
