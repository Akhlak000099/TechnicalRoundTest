package TechnicalRound;

import java.util.Scanner;

public class AscendingAndDescendingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		int size,temp;
		System.out.println("enter size of array :");
		size=ch.nextInt();
		
		int[] arr=new int[size];
		System.out.println("the size of array is :"+size);
		System.out.println("Enter Array Elments :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ch.nextInt();
		}
		System.err.print("[ ");
		for(int j=0;j<arr.length;j++) {
			System.err.print(arr[j]+", ");
		}
		System.err.print(" ]");
		
	
		
		
		// Asecnding And Decending Order
		for(int n1=0;n1<arr.length;n1++) {
			
			for(int n2=n1+1;n2<arr.length;n2++) {
				
//				if(arr[n1]<arr[n2]) {  // descending order
//				
//					temp=arr[n1];
//					arr[n1]=arr[n2];
//					arr[n2]=temp;
//					
//				}
				if(arr[n1]>arr[n2]) {  // Ascending order
					
					temp=arr[n1];
					arr[n1]=arr[n2];
					arr[n2]=temp;
					
				}
//				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
