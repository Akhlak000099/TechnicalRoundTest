package TechnicalRound;

import java.util.Scanner;

public class checkLeapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch= new Scanner(System.in);
		System.out.println("Enter a year for check the leap year or not");
		int year=ch.nextInt();
		
		if(leapYear(year)) {
			System.out.println(year+" This is leap year");			
		}
		else {
			System.out.println(year+" This is not leap year");
			
		}
	}
	
	public static boolean leapYear(int year) {
		// if the year is divided by 4
		if(year%4==0) {
			 // if the year is century
			if(year%100==0) {
				// if year is divided by 400
		        // then it is a leap year
				if(year%400==0) {
					return true;
				}
				else {
					return false;
				}
			}
			// if the year is not century
			else {
				return true;
			}
		}
	return false;		
	}
	

}
