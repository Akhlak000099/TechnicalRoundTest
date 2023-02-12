package TechnicalRoundWthRecursion;

import java.util.Arrays;

public class reverseArrayUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {34,54,7,55,3,23,5,98,100};
		int length=arr.length;
		int[] reverse=reverseArray(arr,0,length-1);
		
		System.out.println(Arrays.toString(reverse));

	}
	public static int[] reverseArray(int[] arr,int i,int j) {
		
		if(i < j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			reverseArray(arr,i+1,j-1);
		}
		
		return arr;
	}

}
