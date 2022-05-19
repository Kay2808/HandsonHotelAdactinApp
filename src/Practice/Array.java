package Practice;

public class Array {
	
	static void min (int arr[]) {
	int min = arr[4];
	for (int k = 1; k < arr.length; k++) {
		if (min>arr[k]) 
			min=arr[k];
		System.out.println(min);
	}
		}
	public static void main(String[] args) {
		
		int a[] = new int[10]; //declaration and instantiation 
		//initialization
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;
		//traversing array  
		int length = a.length;
		System.out.println(length);
		int b[] = {11,21,31,41};
		int length2 = b.length;
		System.out.println(length2);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
		
		int c[] = {45,89,91,2017};
		for (int k : c) {
			System.out.println(k);
			
		}
		
		int d[]= {2011,2013,2014,2015};
		min(d);
		
		
	}

}
