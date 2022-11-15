package HelpToInterview;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorialnumber(15));

	}
	public static long factorialnumber(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorialnumber(n - 1));
	}
}
