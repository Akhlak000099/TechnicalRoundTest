package TechnicalRound;

import java.util.Scanner;

public class PalindromWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=ch.nextInt();
		int sum=0,r,temp;
		
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("The number is Palindrom");
		}
		else {
			System.out.println("The number is not Palindrom :"+temp);
		}
		
		
		
	}

}
