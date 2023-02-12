package TechnicalRound;

import java.util.Scanner;

public class sumofdegit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch=new Scanner(System.in);
		long num;
		int sum=0;
		System.out.println("enter the number above 9 :");
		num=ch.nextLong();
		String convert=Long.toString(num);
		if(num>=0 && num<=9) {
			System.out.println("Sum of Degit is :"+num);
		}
		else {
			
			for(int i=1;i<=convert.length();i++) {
				sum+=i;
			}
			System.out.println(sum);
		}
	}

}
