package HelpToInterview;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123";
//		System.out.println(reverse(str));
		
		StringBuilder out=new StringBuilder();
		char[] chars=str.toCharArray();
		
		for(int i=chars.length-1;i>=0;i--) {
			
			out.append(chars[i]);
		}
		System.out.println(out);
	}

	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
}
