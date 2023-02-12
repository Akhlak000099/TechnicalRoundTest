package TechnicalRound;

import java.util.Scanner;

public class checkAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		System.out.println("Enter a value for check the alphabet or not");
		char cha=ch.next().charAt(0);
		///////method 1///////////////////
		CheckAlphabetMethod1(cha);
		
		//////method 2////////////
		CheckAlphabetMethod2(cha);
	}

	public static void CheckAlphabetMethod1(char ch) {
	
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			
			System.out.println(ch+"This is Alphabet Character");
		}
		else {
			System.out.println(ch+"This is not Alphabet Character");
		}
		
	}
	
	
	public static void CheckAlphabetMethod2(char ch) {
		
		if(Character.isAlphabetic(ch)) {
			System.out.println(ch+"This is Alphabet Character");
		}
		else {
			System.out.println(ch+"This is not Alphabet Character");
		}
		
	}
	

}
