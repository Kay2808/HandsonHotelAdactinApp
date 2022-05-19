package daytwoscanner;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		Scanner sam = new Scanner(System.in);
		System.out.println("Enter the Employee ID :");
		byte empId = sam.nextByte();
		System.out.println("Employee ID :" + empId);
		System.out.println("Enter the Employee Name :");
		String empName = sam.next();
		System.out.println("Employee Name :" + empName);
		System.out.println("Enter the Employee DOB :");
		int dob = sam.nextInt();
		System.out.println("Employee DOB :" + dob);
		System.out.println("Enter the Employee Phone number :");
		long empPhno = sam.nextLong();
		System.out.println("Employee Phone number :" + empPhno);
		System.out.println("Enter the Employee Email ID :");
		String emailId = sam.next();
		System.out.println("Employee Email ID :" + emailId);
		System.out.println("Enter the Employee Salary :");
		float empSalary = sam.nextFloat();
		System.out.println("Employee Salary :" + empSalary);
		System.out.println("Enter the tax :");	
		double tax = sam.nextDouble();
		System.out.println("tax :" + tax);		
		}

}
