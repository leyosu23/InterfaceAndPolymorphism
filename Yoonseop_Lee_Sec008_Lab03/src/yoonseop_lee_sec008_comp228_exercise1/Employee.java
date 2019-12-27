package yoonseop_lee_sec008_comp228_exercise1;
public abstract class Employee {
	
	// Fields
	private int employeeID;
	private String firstName;
	private String lastName;
	
	// getters and setters
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	// Constructor
	public Employee(int employeeID, String firstName, String lastName)
	{
		if (employeeID >= 0)
		{
			this.employeeID = employeeID;
		}
		else
		{
			System.out.println(" Employee ID cannot be zero.\n");
		}
		if (firstName != null)
		{
			this.firstName = firstName;
		}
		else
		{
			System.out.println(" First name cannot be null.\n");
		}
		if (lastName != null)
		{
			this.lastName = lastName;
		}
		else
		{
			System.out.println(" Last name cannot be null.\n");
		}
	}
	
	// Add earnings	
	public abstract double earnings(); // This is abstract method
	
	// ToString
	public String toString()
	{
		return String.format(" %nEmployee ID: %s%n Employee Name: %s ", employeeID, firstName + " " + lastName);
	}
}
