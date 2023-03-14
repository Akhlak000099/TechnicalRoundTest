package Threesum;
// Reverse a String 
import java.util.Scanner;

public class reverseSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str, reverse="";
		char  ch;
		System.out.println("Enter a Strinng value : ");
		str=sc.next();
		
		System.out.println("Your String value :"+str);
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			reverse = ch+reverse;
		}
		System.out.println("Your Reverse String : "+reverse);
		

	}

}
