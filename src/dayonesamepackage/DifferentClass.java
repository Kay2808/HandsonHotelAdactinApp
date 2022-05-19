package dayonesamepackage;
import dayonesamepackage.SamePackage;
import dayonediffpackage.ProjectDetails;

public class DifferentClass  {

	public void companyName() {
		System.out.println("Company Name is TCS");
	}

	public void companyLocation() {
		System.out.println("Company Location is Siruseri, Chennai");
	}

	public static void main(String[] args) {
		ProjectDetails pd = new ProjectDetails();
		DifferentClass dc = new DifferentClass();
		dc.companyName();
		dc.companyLocation();
		pd.facilitiesName();
		pd.facilitiesName();
		pd.clientLocation();
		pd.clientName();
		
		
	}
}
