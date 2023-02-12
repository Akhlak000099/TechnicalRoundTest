package TechnicalRound;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		int num;
		System.out.println("enter a number for find in fibonacci seriies :");
		num=ch.nextInt();
		int n1=1,n2=1,n3;
		
		System.out.print(n1);
		System.out.print(" "+n2);
		
		for(int i=2;i<num;i++) {
			
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
