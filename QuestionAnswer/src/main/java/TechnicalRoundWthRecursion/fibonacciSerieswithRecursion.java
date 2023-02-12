package TechnicalRoundWthRecursion;

import java.util.Scanner;

public class fibonacciSerieswithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		int number;
		System.out.println("enter a number for find fibonacci number with using recursion :");
		number=ch.nextInt();
		System.out.println("the fibonacci number is :"+fibonacci(number));
		
	}
	public static int fibonacci(int num) {
		
		if(num==0) {
			return 0;
		}
		else if(num==1 || num==2) {
			return 1;
		}
		return fibonacci(num-2)+fibonacci(num-1);
	}

}
