package TechnicalRound;

public class StringFindSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s1 = "for";
	        String s2 = "geeksforgeeks";
	 
	        int res = isSubstring2(s1, s2);
	 
	        if (res == -1)
	            System.out.println("Not present");
	        else
	            System.out.println(s1+":   vvfdw1uuu Present at index " + res);
	}
	
	
///////////////////Method 1/////////////////////////////
	public static int isSubstring(String s1,String s2) {
		
		for(int i=0;i<s2.length() - s1.length();i++) {
			int j;
			for(j=0;j<s1.length();j++) {
				if(s2.charAt( i + j ) != s1.charAt(j)) {
					break;
				}
			}
			if(j==s1.length()) {
				return i;
			}
		}
		return -1;
		
	}
	
///////////////Method 2///////////////////////////////
public static int isSubstring2(String s1,String s2) {

	return s2.indexOf(s1);
}
}
