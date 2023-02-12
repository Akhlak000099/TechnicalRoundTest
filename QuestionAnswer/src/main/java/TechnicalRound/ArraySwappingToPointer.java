package TechnicalRound;

import java.util.Scanner;

public class ArraySwappingToPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of Array ");
		size=ch.nextInt();
		
		int arr1[] = new int[size];
		System.out.println("The size of array :"+size+"\nEnter the number of Array element");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=ch.nextInt();
		}
		int arr2[] = new int[size];
		System.out.println("\nThe size of array :"+size+"\nEnter the number of Array element");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=ch.nextInt();
		}
		
		System.out.println("Before Array 1 Swapping :\n");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("Before Array 2 Swapping :\n");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		for(int swap=0;swap<size;swap++) {
			arr1[swap]=arr1[swap]+arr2[swap];
			arr2[swap]=arr1[swap]-arr2[swap];
			arr1[swap]=arr1[swap]-arr2[swap];
		}
		System.out.println("\nAfter Array 1 Swapping :");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\nAfter Array 2 Swapping :");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
