package TechnicalRound;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingAndReverseInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		int size,temp;
		System.out.println("Sorting And Reverse In Array \n");
		System.out.println("enter size of array :");
		size=ch.nextInt();
		
		int[] arr=new int[size];
		System.out.println("the size of array is :"+size);
		System.out.println("Enter Array Elments :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ch.nextInt();
		}
		System.out.println("Befor Sorting And Reverse Array");
		System.out.print("[ ");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+", ");
		}
		System.out.print("]");
		
		System.out.println();
		System.out.println("After Sorting Array");
		Arrays.sort(arr);
		System.out.print("[ ");
		for(int s=0;s<arr.length;s++) {
			System.out.print(arr[s]+", ");
		}
		System.out.print("]\n");
		
		
		System.out.println("After Reverse Array method 1");	
		int j=size;
		int[] b=new int[size];
		for(int r=0;r<arr.length;r++) {
			b[j-1]=arr[r];
			j=j-1;						

		}
		System.out.print("[ ");

		for(int r=0;r<arr.length;r++) {
			System.out.print(" "+b[r]);
		}
		System.out.print("]\n");
		
		System.out.println("After Reverse Array method 2");	
		int t;
		for(int i=0;i<arr.length/2;i++) {
				t=arr[i];
				arr[i]=arr[size-i-1];
				arr[size-i-1]=t;

		}
		System.out.print("[ ");

		for(int r=0;r<arr.length;r++) {
			System.out.print(" "+arr[r]);
		}
		System.out.print("]");
	}

}
