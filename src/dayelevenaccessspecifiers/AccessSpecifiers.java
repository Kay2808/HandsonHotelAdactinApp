package dayelevenaccessspecifiers;

public class AccessSpecifiers {
	//access specifier examples
	private void privateSam() {
		System.out.println("This is Private Method");
	}

	void defaultSam() {
		System.out.println("This is Default Method");
	}

	protected void protectedSam() {
		System.out.println("This is Protected Method");
	}

	public void publicSam() {
		System.out.println("This is Public Method");
	}

	public static void main(String[] args) {
		AccessSpecifiers acc = new AccessSpecifiers();
		acc.privateSam();
		acc.defaultSam();
		acc.protectedSam();
		acc.publicSam();
	}
}
