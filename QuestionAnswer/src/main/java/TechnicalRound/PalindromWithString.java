package TechnicalRound;

import java.util.Scanner;

public class PalindromWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		System.out.println("Enter a String value");
		String str=ch.nextLine();
		String reverse="";
		char  st;
		
		for(int i=0;i<str.length();i++) {
			st=str.charAt(i);
			reverse = st+reverse;
		}
		
		if(str.equals(reverse)) {
			System.out.println("This is Palindrom String Method 1");
		}
		else {
			System.out.println("This is not Palindrom String Method 1");
		}
		System.out.println();
		
	}
	
	
	

}
