package HelpToInterview;

public class Find_second_largest_number {
 
public static void main(String[] args) {
	int[] array= {3,5,6,86,45,22,55};
	int highest = Integer.MIN_VALUE;
	int secondHighest = Integer.MIN_VALUE;
	
	for(int i:array) {
		if(i>highest) {
			secondHighest = highest;
			highest = i;
		}
		else if (i > secondHighest) {
			secondHighest = i;
		}
		
	}
	System.out.println("Highest number in array :"+highest);
	System.out.println("Second Highest number in array :"+secondHighest);
}
 
}