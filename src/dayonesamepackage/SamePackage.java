package dayonesamepackage;

public class SamePackage {
	public void empID() {
		System.out.println("Employee ID is 10868");
	}

	public void empName() {
		System.out.println("Employee Name is Karthik");
	}

	public void empDOB() {
		System.out.println("Employee DOB is DDMMYYYY");
	}

	public void empPhone() {
		System.out.println("Employee Phone number is 9790159859");
	}

	public void empMail() {
		System.out.println("Employee Email ID is karrthik.0109@gmail.com");
	}

	public void empAddress() {
		System.out.println("Employee Address is Kelambakkam, Chennai");
	}

	public static void main(String[] args) {
		SamePackage sample = new SamePackage();
		sample.empID();
		sample.empName();
		sample.empDOB();
		sample.empPhone();
		sample.empMail();
		sample.empAddress();
	}

}
