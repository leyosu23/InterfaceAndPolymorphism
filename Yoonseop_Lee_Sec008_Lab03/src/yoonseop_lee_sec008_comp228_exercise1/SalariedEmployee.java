package yoonseop_lee_sec008_comp228_exercise1;

public class SalariedEmployee extends Employee{
	
		// Fields
		private double weeklySalary;
		
		// constructor
			public SalariedEmployee(int employeeID, String firstName, String lastName,double weeklySalary)
			{
				super(employeeID,firstName,lastName);
				 setWeeklySalary(weeklySalary);
			}
			
		// getters and setters
		public double getWeeklySalary() {
			return weeklySalary;
		}
		public void setWeeklySalary(double weeklySalary) {
			if(weeklySalary > 200)
			{
				this.weeklySalary = weeklySalary;
			}
			else
			{
				System.out.println("weekly Salary should be greater than 200.");
			}
		}
		
		// method 
			public double earnings()
			{
				double employeeCommission = weeklySalary;
				return employeeCommission;
			}
		
		@Override
		public String toString()
		{
			return String.format("%s%n the Number Of Piece: %.2f", super.toString(), this.getWeeklySalary());	
		}
} 
