package TechnicalRound;

import java.util.Scanner;

public class FindTheGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch=new Scanner(System.in);
		System.out.println("Enter num1 value ");
		int num1=ch.nextInt();
		System.out.println("Enter num2 value ");
		int num2=ch.nextInt();
		
		GCD_Method1(num1,num2);
		//GCD_Method2(num1,num2);

	}
	public static void GCD_Method1(int n1,int n2) {
		int gcd = 1;
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
	}
	
	public static void GCD_Method2(int n1,int n2) {
		
		while(n1!=n2) {
			if(n1>n2) {
				n1-=n2;
			}
			else {
				n2-=n1;
			}
		}
		System.out.println("GCD :"+n1 );
	}

}
