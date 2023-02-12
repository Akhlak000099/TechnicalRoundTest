package TechnicalRound;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size;
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter the size of pyramid :");
		size=ch.nextInt();
		
		for(int i=1;i<=size;i++) {
			for(int k=size-1;k>=i;k--) {
				
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
