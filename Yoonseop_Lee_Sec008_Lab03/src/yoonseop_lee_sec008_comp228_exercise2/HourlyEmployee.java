package yoonseop_lee_sec008_comp228_exercise2;

public class HourlyEmployee extends Employee{

	// fields
	int hoursWorkedPerWeek;
	double hourlyRate;
	
	// getters and setters

	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		if(hourlyRate > 14)
		{
			this.hourlyRate = hourlyRate;
		}
		else
		{
			System.out.println("hourlyRate should not be less than 14.");
		}
	}
	
	public int getHoursWorkedPerWeek() {
		return hoursWorkedPerWeek;
	}
	public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
		if(hoursWorkedPerWeek>0)
		{
			this.hoursWorkedPerWeek = hoursWorkedPerWeek;
		}
		else
		{
			System.out.println("hours worked per week should not be less than 0.");
		}
	}
	
	// method 
		public double getPaymentAmount()
		{
			double employeeCommission = hoursWorkedPerWeek * hourlyRate;
			return employeeCommission;
		}
		
	// constructor
	public HourlyEmployee(String employeeID, String firstName, String lastName, int hoursWorkedPerWeek,
			double hourlyRate) {
		super(employeeID,firstName,lastName);
		setHourlyRate(hourlyRate);
		setHoursWorkedPerWeek(hoursWorkedPerWeek);
	}
		
	@Override
	public String toString()
	{
		return String.format("Hourly Emploee: %s%n Hours Worked Per Week: %d%n Hourly Rate: $%.2f", super.toString(), this.getHoursWorkedPerWeek(), this.getHourlyRate());	
	}
}
