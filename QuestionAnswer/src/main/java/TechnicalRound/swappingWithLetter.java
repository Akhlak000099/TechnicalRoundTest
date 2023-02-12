package TechnicalRound;

import java.util.Scanner;

public class swappingWithLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter str1 value :");
		str1=ch.next();
		System.out.println("Enter str2 value :");
		str2=ch.next();
		
		System.out.println("Before swapping value str1 value is :"+str1);
		System.out.println("Before swapping value str2 value is :"+str2);
		System.out.println();
		
		str1=str1+str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
	    str1 = str1.substring(str2.length());
	    
	    System.out.println("After swapping value str1 value is :"+str1);
		System.out.println("After swapping value str2 value is :"+str2);
	}

}
