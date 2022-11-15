package HelpToInterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class merge_two_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1=new ArrayList<>();
		l1.add("Akhlak");
		List<String> l2=new ArrayList<>();
		l2.add("Ansari");
		
		List<String> margeList=new ArrayList<>(l1);
		margeList.addAll(l2);
		System.out.println(margeList);
		
		
		
		List<String> link1=new LinkedList<String>();
		link1.add("Akhlak");
		List<String> link2=new LinkedList<String>();
		link2.add("Ansari");
		
		List<String> marge=new LinkedList<String>(link1);
		marge.addAll(link2);
		
		System.out.println(marge);
	}

}
