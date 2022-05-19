package dayelevenaccessspecifiers;

public final class AccessModifiers2 {
	
	private static int a;
	public final void scienceSam() {
int a=68;
	}
	public static void main(String[] args) {
		AccessModifiers2 accm2 = new AccessModifiers2();
		accm2.scienceSam();
		a++;
		System.out.println(a);
	}

}
