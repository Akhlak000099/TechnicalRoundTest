package HelpToInterview;

import java.util.Scanner;

public class reverse_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1233421;
		int reverse=0;
		while(n !=0) {
			
			int reminder = n%10;
			reverse=reverse*10+reminder;
			n=n/10;
			
			
		}
		System.out.println(reverse);
		
		
		// Reverse a number using recursion
		System.out.print("Enter the number that you want to reverse: ");  
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt();  
		System.out.print("The reverse of the given number is: ");  
		//method calling  
		reverseNumber(num);  
	}
	
	//Reverse a number using recursion
	public static void reverseNumber(int number)   
	{  
	if (number < 10)   
	{  
	//prints the same number if the number is less than 10  
	System.out.println(number);  
	return;  
	}  
	else   
	{  
	System.out.print(number % 10);  
	reverseNumber(number/10);  
	}  
	
	}  

}
