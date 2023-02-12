package TechnicalRound;

import java.util.Arrays;
import java.util.Scanner;

public class highest2_lowest2InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		int temp;
		System.out.println("Enter size of array :");
		int size=ch.nextInt();
		
		int[] arr=new int[size];
		System.out.println("The size of array is "+size);
		System.out.println("Now enter the array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ch.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("The Second lowest of element in array is:"+arr[1]);
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("The Second Highest of element in array is:"+arr[1]);
		System.out.println(Arrays.toString(arr));


	}

}
