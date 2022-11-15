package HelpToInterview;

public class removeWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Akhlak Ansari";
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for(char c : charArray) {
			if (!Character.isWhitespace(c)) {
				
				output.append(c);
				
			}
			
				
			
		}
		String s = "  abc  def\t  ";
		
		s = s.strip();
				
		System.out.println(s);
		
		
	}

}
