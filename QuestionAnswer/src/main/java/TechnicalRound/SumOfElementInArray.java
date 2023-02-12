package TechnicalRound;

import java.util.Scanner;

public class SumOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=ch.nextInt();
		int[] arr=new int[size];
		
		System.out.println("the size of array : ("+ size+") Now you enter array elements :");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=ch.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]+"\n");
		}
		
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("the sum of array elements is :"+sum);
	}

}
