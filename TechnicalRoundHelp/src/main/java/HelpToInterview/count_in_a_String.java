package HelpToInterview;

import java.util.HashMap;
import java.util.Map;

public class count_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abcdAbdAssder";
		char[] chars=str.toCharArray();
		
		Map<Character, Integer> charcount=new HashMap<>();
		
		for(char c:chars) {
			if(charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c)+1);
			}
			else {
				charcount.put(c,1);
			}
		}
		System.out.println(charcount);
	}

}
