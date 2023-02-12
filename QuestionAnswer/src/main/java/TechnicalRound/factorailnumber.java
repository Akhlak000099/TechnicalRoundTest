package TechnicalRound;

import java.util.Scanner;

public class factorailnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner ch=new Scanner(System.in);
		int num;
		System.out.println("Enter a number for get factorial number : ");
		num=ch.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			System.out.println(fact*=i);
		}
	    System.out.println("Factorial of :"+num+" is : "+fact);
		
	}

}
