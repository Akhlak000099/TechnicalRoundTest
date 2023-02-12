package TechnicalRound;

import java.util.Scanner;

public class GetPrimeNumber {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		////////method 1 with single number ////////
		findPrimeNumberWithSingleNumber();
		
		///////////method 2 with two Number (Starting  number and Ending number)
//		FindPrimeWithTwoNumber();
		
	}
	
	public static void findPrimeNumberWithSingleNumber() {
		
		Scanner ch=new Scanner(System.in);
		
		System.out.println("Enter a number to check the prime or not :");
		int num=ch.nextInt();
		
		if(num==0 || num==1) {
			System.out.println("it is not prime number :"+num);
		}
		
		else {
			
			if(isprime(num)) {
				System.out.println(num+" This is prime number");
			}
			else {
				System.out.println(num+" This is not prime number");
			}
		}
	}
	
	public static void FindPrimeWithTwoNumber() {
		Scanner ch=new Scanner(System.in);
		
		System.out.println("Enter start number :");
		int start=ch.nextInt();
		System.out.println("Enter End number :");
		int end=ch.nextInt();
		System.out.println("List of prime number between :"+start+" to "+end);
		
		for(int i=start;i<=end;i++) {
			if(isprime(i)) {
				System.out.println(i+" This is prime number");
			}
			else {
				System.out.println(i+" This is not prime number");
			}
		}
			
	}
	public static boolean isprime(int num) {
		if(num<=1) {
		return false;
		}
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
	}

}
