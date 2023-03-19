package VaccineDose;

public abstract class vaccine {

	public void firstDose(String country,int age) {
		if(country.equals("Indian")) {
			if(age>=18) {
				System.out.println("You can take first dose.");
				System.out.println("Now You Pay Rs. 750");
				secondDose(true);
			}
			else {
				System.out.println("You are not eligeble for first dose because you are age under the 18 year ");
				secondDose(false);
			}
		}
		else{
			System.out.println("Sorry,You are not eligeble for vaccine becaue you are not Inidan ");
			secondDose(false);
		}
	}
	
	public void secondDose(boolean firstDoseCompleted) {
		if(firstDoseCompleted) {
			System.out.println("You are eligeble for second dose");
			System.out.println("You Can Take Second Dose");
			boosterDose(true);
			
		}
		else {
			System.out.println("Sorry, Your first dose is not completed");
			boosterDose(false);
		}
	}
	
	public abstract void boosterDose(boolean isSecondDoseCompleted);
}
