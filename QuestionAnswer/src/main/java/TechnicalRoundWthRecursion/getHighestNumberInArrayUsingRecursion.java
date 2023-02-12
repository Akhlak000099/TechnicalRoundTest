package TechnicalRoundWthRecursion;

public class getHighestNumberInArrayUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//////// n is define the array size///////
		int n=7;
		///////// here declare the array and its elements;///////
		int[] arr= {23,56,76,5,8,9,105};
		
		System.out.println(max(arr,n));
	}
	
	/////////////////////method 1/////////////////////
	public static int max(int[] a, int n) {
        if(n < 0) {
            return Integer.MIN_VALUE;
        }
        return Math.max(a[n-1], max(a, n - 2));

    }
	
	////////////method 2////////////////////////////////
	public static int maxElement(int[] arr,int index,int max) {
		int largest=max;
		while(index < arr.length) {
			if(index==0) {
				largest=arr[0];
			}
			else if(index<arr[index+1]) {
				largest=arr[index+1];
				System.out.println("Largest Number :"+largest);
			}
			maxElement( arr,index+1,largest);
		}
		return largest;
	}

}
