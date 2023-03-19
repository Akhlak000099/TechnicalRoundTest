package VaccineDose;

public class FullyVaccination extends vaccine{

	@Override
	public void boosterDose(boolean isSecondDoseCompleted) {
		// TODO Auto-generated method stub
		if(isSecondDoseCompleted) {
			System.out.println("You can take booster dose");
		}
		else {
			System.out.println("sorry, your second dose is not completed");
		}
	}

}
