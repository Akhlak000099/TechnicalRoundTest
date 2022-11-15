package HelpToInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class same_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		System.out.println(sameElements(a1, a2));
		//System.out.println(sameElements(a1, a3));
	}
	static boolean sameElements(Object[] array1, Object[] array2) {
		Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(array1));
		//Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(array2));
		
		// if size is different, means there will be a mismatch
//		if(uniqueElements1.size() != uniqueElements2.size()) return false;
		
		for(Object obj : uniqueElements1) {
			// element not present in both?
			if (!uniqueElements1.contains(obj))return false;
		}
		
		
		
		String textBlock="""
				Hi, I
				Am Akhlak Ansari
				And 
				I am from India
				""";
		
		System.out.println(textBlock);
		return true;
	}
	
	

}
