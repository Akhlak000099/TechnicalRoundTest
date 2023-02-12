package TechnicalRound;

import java.util.Scanner;

public class AarmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter a number for check the aarmstrong number ");
		int n=ch.nextInt();
		
		int r,sum=0,copy;
		copy=n;
		
		while(n>0) {
			r = n%10;
			sum += Math.pow(r, 3);
			n /= 10;
		}
		
		if(sum==copy) {
			System.out.println("Your "+sum+ " number is a Aarstrong number ");
		}
		else {
			System.out.println("Your "+copy+" number is not a Aarmstrong number ");
		}

	}

}
