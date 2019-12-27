package yoonseop_lee_sec008_comp228_exercise3;

public class CommissionEmployee extends Employee {

	// fields
	int grossSales;
	double commissionRate = 0.1; 
	
	// constructor
		public CommissionEmployee(String employeeID, String firstName, String lastName, int grossSales, double commissionRate) {
			super(employeeID,firstName,lastName);
			setCommissionRate(commissionRate);
			setGrossSales(grossSales);
		}
		
		
	// getters and setters	
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		if(commissionRate > 0.1 && commissionRate < 1)
		{
			this.commissionRate = commissionRate;
		}
		else
		{
			System.out.println("Commission Rate should be between 0.1 and 1.");
		}
	}
	
	public int getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(int grossSales) {
		if(grossSales > 0)
		{
			this.grossSales = grossSales;
		}
		else
		{
			System.out.println("Gross Sales should not be negative.");
		}
	}
	
	// method
	public double earnings()
	{
		double employeeCommission = commissionRate * grossSales / 100;
		return employeeCommission;
	}
	
	@Override
	public double getPaymentAmount() { return earnings(); }
	
	@Override
	public String toString()
	{
		return String.format("Commision employee: %s%n Gross Sales: $%s%n Commission Rate: %s", super.toString(), grossSales, commissionRate);
	}

}
