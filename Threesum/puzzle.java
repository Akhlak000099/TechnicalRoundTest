package Threesum;
//fizzbuzz write a java program that prints the numbers from 1 to 100. for multiples of three, p
import java.util.Scanner;

public class puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int num;
		System.out.println("Enter the number for check puzzle ");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				System.out.print("Fizz");
			}
			else if(i%5==0) {
				System.out.print("Buzz");
			}
			else if(i%3==0 && i%5==0) {
				System.out.print("FizzBuzz");
			}
			
			else {
				System.out.print(" "+i+" ");
			}
		}

	}

}
