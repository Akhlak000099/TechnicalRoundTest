package HelpToInterview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class collectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List arrlist=new ArrayList<Integer>();
		
		Scanner ch=new Scanner(System.in);
		ArrayList<ArrayList> arr = null;
		System.out.println("Enter the size of ArrayList :");
		int k=ch.nextInt();
		
				for(int n=1;n<=k;n++) {
				int num;
				System.out.println("Enter  your number");
				num=ch.nextInt();
				
		      	arrlist.add(num);
//		      	Collections.sort(arrlist);
		      	Collections.sort(arrlist, Collections.reverseOrder());  
		      	
		      
	       	}
				System.out.println(arrlist.get(1));

//
				
				for(int i=0;i<k;i++) {
					for(int j=1;j<k;j++) {
//						if(arrlist[i]==arrlist[j]) {
							System.out.println("same");
//						}
					}
				}
//				Iterator<Integer> iter=arrlist.iterator();
//				while(iter.hasNext()) {
//					System.out.println("Your number is :"+iter.next());
//				}

				
//		for(int i=0;i<=5;i++) {
//			
//			arrlist.add[i]=ch.nextInt();
//		}
	}

}
