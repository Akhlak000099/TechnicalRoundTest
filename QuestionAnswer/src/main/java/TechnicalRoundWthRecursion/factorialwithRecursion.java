package TechnicalRoundWthRecursion;

import java.util.Scanner;

public class factorialwithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch=new Scanner(System.in);
		int num;
		System.out.println("Enter a number for get factorial number ");
		num=ch.nextInt();
		System.out.println("the factorial number is :"+fact(num));
	}
	public static long fact(long num) {
		if(num==1) {
			return 1;
		}
		else {
			return(num * fact(num-1));
		}
		
//		
//		public static long fact(long num) {
//			if(num==1) {
//				return 1;
//			}
//			else {
//				return(num + fact(num-1));
//			}
	}

}
