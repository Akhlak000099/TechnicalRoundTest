package Threesum;
//Find maximum element in an array Write a java program takes an integer array as input and finds the maximum element in that array
import java.util.Arrays;
import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int size;
		
		System.out.println("Enter the size of array ");
		size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("The size of Array is "+ size);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("your Array :"+Arrays.toString(arr));
		
//		Now find the highest the number
		
		
		for(int n1=0;n1<arr.length;n1++) {
			for(int n2=n1+1;n2<arr.length;n2++) {
				
				if(arr[n1]<arr[n2]) {
					int temp =arr[n1];
					arr[n1]=arr[n2];
					arr[n2]=temp;
				}
			}
			
		}
		System.out.println("DESC Array :"+Arrays.toString(arr));
		System.out.println("The Highest number in Array :"+arr[0]);
		System.out.println("The Second Highest number in Array :"+arr[1]);
	}

}
