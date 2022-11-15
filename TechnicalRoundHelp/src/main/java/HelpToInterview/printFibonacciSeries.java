package HelpToInterview;

public class printFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =5;
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
		
		// second type to get the fibonacci series 
		System.out.println(fibonacci(10));
	}
	
	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}


}
