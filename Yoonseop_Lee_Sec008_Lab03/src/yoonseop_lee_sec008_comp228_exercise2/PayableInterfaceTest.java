// Fig. 10.14: PayableInterfaceTest.java
// Payable interface test program processing Invoices and 
// Employees polymorphically.
package yoonseop_lee_sec008_comp228_exercise2;

public class PayableInterfaceTest { public static void main(String[] args) {
	
	  Payable[] payableObjects = new Payable[] {
		         new Invoice("01234", "seat", 2, 375.00),
		         new Invoice("56789", "tire", 4, 79.95),
		         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
		         new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00),
		         new CommissionEmployee("John", "Dow", "234-11-1111", 3000, 0.5),
		         new BasePlusCommissionEmployee("Happy", "Employee", "891-11-1111", 10000, 0.9 , 500),
		         new HourlyEmployee("Who", "Ever", "777-11-1111", 40, 30)
		      };

     System.out.printf("Employees processed polymorphically:%n%n");

     // generically process each element in array employees
     for (Payable currentEmployee : payableObjects) {
        System.out.println(currentEmployee); 

        // determine whether element is a BasePlusCommissionEmployee
        if (currentEmployee instanceof BasePlusCommissionEmployee) {
           BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

           employee.setBaseSalary(1.10 * employee.getBaseSalary());

           System.out.printf(
              "new base salary with 10%% increase is: $%,.2f%n",
              employee.getBaseSalary());
        } 
        // determine whether element is a HourlyEmployee
        else if (currentEmployee instanceof HourlyEmployee) {
        	HourlyEmployee employee =  (HourlyEmployee) currentEmployee;

            employee.setHourlyRate(employee.getHourlyRate() +2 );

            System.out.printf(
            		"new hourly rate with $2 increase is: $%,.2f%n", employee.getHourlyRate());
         } 
        // Earning
        System.out.printf(" Earnings ===>  $%,.2f%n%n", currentEmployee.getPaymentAmount());
          
     }      
   } 
} 

