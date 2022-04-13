package pack;

import java.util.Scanner;

public class FoodCorporation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++){
			
			System.out.println();
			
			System.out.println("For Employee Number: " + i);
			
			System.out.println("Enter Base Pay:");
			
			Demo.basePay = scan.nextDouble();
			
			System.out.println("Enter Hours Worked:");
			
			Demo.hoursWorked = scan.nextInt();
			
			Demo.salaryCalculation();
		}
	}
}