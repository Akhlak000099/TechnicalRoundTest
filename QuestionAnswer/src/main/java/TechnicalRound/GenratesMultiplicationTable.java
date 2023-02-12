package TechnicalRound;

import java.util.Scanner;

public class GenratesMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		System.out.println("Enter a number for getting table :");
		int n=ch.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}

}
