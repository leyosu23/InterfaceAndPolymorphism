package yoonseop_lee_sec008_comp228_exercise1;


public class EmployeeTest {

	public static void main(String[] args) {
		
		CommissionEmployee commission1 = new CommissionEmployee(123456789, "John", "Dow", 3000, 0.5);
		BasePlusCommissionEmployee basecommission1 = new BasePlusCommissionEmployee(246813579, "Happy", "Employee", 10000, 0.9 , 500);
		HourlyEmployee hourlyEmployee1 = new HourlyEmployee(135792468, "Who", "Ever", 40, 30);
		PieceWorker pieceWorker1 = new PieceWorker(012341234, "What", "SoEver", 120);
		SalariedEmployee salariedEmployee1 = new SalariedEmployee(000012345, "I", "DontKnow", 220);
		
		Employee[] employeeArray = new Employee[5];
		employeeArray[0] = commission1;
		employeeArray[1] = basecommission1;
		employeeArray[2] = hourlyEmployee1;
		employeeArray[3] = pieceWorker1;
		employeeArray[4] = salariedEmployee1;
		
		// Use enhanced for loop to print their data
		for (Employee employees: employeeArray)
		{
			System.out.println(employees);
			System.out.print(" Earnings ===> ");
			System.out.println(employees.earnings());
		}
	}
}
