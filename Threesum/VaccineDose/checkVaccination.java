package VaccineDose;

import java.util.Scanner;

public class checkVaccination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		FullyVaccination fv= new FullyVaccination();
		System.out.println("Enter your country name: ");
		String country=sc.next();
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		fv.firstDose(country, age);
	}

}
