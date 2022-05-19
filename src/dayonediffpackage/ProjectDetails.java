package dayonediffpackage;
import dayonediffpackage.ClientDetails;

public class ProjectDetails extends ClientDetails {

	
	public void facilitiesName() {
		System.out.println("Facility Model is one of the porject");
	}

	public void equipmentsName() {
		System.out.println("Equipment Model is one of the porject");

	}
	
	public static void main(String[] args) {
		ProjectDetails pd = new ProjectDetails();
		pd.facilitiesName();
		pd.equipmentsName();
		pd.clientLocation();
		pd.clientName();
	}

}
