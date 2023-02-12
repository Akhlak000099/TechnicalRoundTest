package TechnicalRound;

import java.util.Scanner;

public class swapWithTwoVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter num1 value :");
		num1=ch.nextInt();
		System.out.println("Enter num2 value :");
		num2=ch.nextInt();
		
		System.out.println("Before swapping value num1 value is :"+num1);
		System.out.println("Before swapping value num2 value is :"+num2);
		System.out.println();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swapping value num1 value is :"+num1);
		System.out.println("After swapping value num2 value is :"+num2);
		
		
	}

}
