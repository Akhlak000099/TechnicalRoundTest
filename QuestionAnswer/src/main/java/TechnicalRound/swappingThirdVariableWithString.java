package TechnicalRound;

import java.util.Scanner;

public class swappingThirdVariableWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch=new Scanner(System.in);
		String str1,str2, temp;
		System.out.println("Enter str1 value :");
		str1=ch.next();
		System.out.println("Enter str2 value :");
		str2=ch.next();
		System.out.println("swapping with third variable");
		System.out.println("Before swapping value str1 value is :"+str1);
		System.out.println("Before swapping value str2 value is :"+str2);
		System.out.println();
		
		temp=str1;
		str1=str2;
		str2=temp;
		
	    System.out.println("After swapping value str1 value is :"+str1);
		System.out.println("After swapping value str2 value is :"+str2);
	}

}
