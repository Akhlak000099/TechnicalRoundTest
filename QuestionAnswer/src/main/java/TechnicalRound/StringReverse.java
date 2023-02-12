package TechnicalRound;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		String str;
		System.out.println("Enter a  String value :");
		str=ch.nextLine();
		
        ////////////////First Method of String Reverse//////////////
		String copy="";
		char st;
		for(int i=0;i<str.length();i++) {
			
			st=str.charAt(i);
			copy=st+copy;
		}
		System.out.println(copy);
		
		
		////////////////Second Method of String Reverse//////////////
		StringBuilder input= new StringBuilder();
		input.append(copy);
		input.reverse();
		System.out.println(input);
	}

}
