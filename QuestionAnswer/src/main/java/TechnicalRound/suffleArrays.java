package TechnicalRound;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class suffleArrays {

	static Random random=new Random();
	 static Scanner ch=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		System.out.println("Enter the size of Array ");
		size=ch.nextInt();
		
		Integer[] arr1 =new Integer[size];
		System.out.println("The size of array :"+size+"\nEnter the number of Array element");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=ch.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		////////////////////////////Print the Suufle Element///////////////////////////
		System.out.println("Method 1 : Suffle with Array Elements");
		suffleArraymethod1();
		System.out.println("Method 2 : Suffle with Array Elements");
		suffleWithUsingCollectionsClassMethod2(arr1);

	}
	
	
	public static void suffleArraymethod1() {
		int size;
		System.out.println("Enter the size of Array ");
		size=ch.nextInt();
		
		int[] arr=new int[size];
		System.out.println("The size of array :"+size+"\nEnter the number of Array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ch.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		char cho;
		do {
			for(int i=0;i<arr.length;i++) {
				int randomIndexToSwap=random.nextInt(arr.length);
				
				int temp=arr[randomIndexToSwap];
				arr[randomIndexToSwap]=arr[i];
				arr[i]=temp;
			}
			System.out.println(Arrays.toString(arr));
		 
			System.out.println("Would you likt to continue this process so press y key otherwise press any key");
			cho=ch.next().charAt(0);
		}while(cho=='y' || cho=='Y');
		
	}
	
	public static void suffleWithUsingCollectionsClassMethod2(Integer[] arr) {
		char cho;
		do {
		List<Integer> inList=Arrays.asList(arr);
		Collections.shuffle(inList);
		inList.toArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Would you likt to continue this process so press y key otherwise press any key");
		cho=ch.next().charAt(0);
	}while(cho=='y' || cho=='Y');
	
	}
	
	

}
