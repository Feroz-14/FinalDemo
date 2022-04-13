package pack;

public class Demo {
	
	static final double minimumWage = 8.0;
    static final int maxHours = 60;
	static double basePay = 0;
	static int hoursWorked = 0;
	
	public static void salaryCalculation(){
        double totalSalary = 0;
        if ((basePay < minimumWage) || (hoursWorked > maxHours)){
            System.out.println("Error!");
        }
        else {   

        if (hoursWorked > 40){
                    totalSalary = basePay * 40 + 1.5*basePay*(hoursWorked - 40);
                }
                else {
                    totalSalary = basePay * hoursWorked;
                }
                System.out.println("Your total salary is " + totalSalary);
            }
	}
}