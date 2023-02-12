package TechnicalRound;

import java.util.Scanner;

public class duplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of Array ");
		size=ch.nextInt();
		
		int arr[] = new int[size];
		System.out.println("The size of array :"+size+"\nEnter the number of Array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ch.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int k=0;k<arr.length;k++) {
			for(int j=k+1;j<arr.length;j++) {
				if(arr[k]==arr[j]) {
					System.out.print("\n "+arr[j]);
				}
				else {
				}
			
			}
//			
		}
		
		
		///////////////////////////////////////////////////////////////
	
		}
		
	
	

}
