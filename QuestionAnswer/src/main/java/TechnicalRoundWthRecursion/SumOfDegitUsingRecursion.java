package TechnicalRoundWthRecursion;

public class SumOfDegitUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDegit(1290));
		

	}
	public static long sumOfDegit(long num) {
		if(num==0) {
		return 0;
		}
		return (num % 10 + sumOfDegit(num/10));
	}

}
