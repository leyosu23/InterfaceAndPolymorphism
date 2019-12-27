package yoonseop_lee_sec008_comp228_exercise2;

//relationship is setup between the following classes by use of keyword extends (instead of : )
public class BasePlusCommissionEmployee extends CommissionEmployee {

		// fields
		double baseSalary = 200.00;
		
		// constructor
		public BasePlusCommissionEmployee(String employeeID, String firstName, String lastName, int grossSales,
			double commissionRate, double baseSalary) {
		super(employeeID, firstName, lastName, grossSales, commissionRate);
		setBaseSalary(baseSalary);
		}
				
		// getters and setters
		public double getBaseSalary() {
			return baseSalary;
		}
		public void setBaseSalary(double baseSalary)
		{
			if (baseSalary > 200)
			this.baseSalary = baseSalary;
		}
		
		// method
		public double getPaymentAmount()
		{
			double employeeCommission = super.getPaymentAmount() + baseSalary;
			return employeeCommission;
		}
	
	@Override
	public String toString()
	{
		return String.format(" %nBasePlus %s %n Base Salary: $%.2f", super.toString(), baseSalary);
	}

}