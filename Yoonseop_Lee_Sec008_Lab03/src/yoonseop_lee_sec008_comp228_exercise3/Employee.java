package yoonseop_lee_sec008_comp228_exercise3;
public abstract class Employee implements Payable {
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;

   // constructor
   public Employee(String firstName, String lastName, 
      String socialSecurityNumber) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
   } 

   // return first name
   public String getFirstName() {return firstName;}

   // return last name
   public String getLastName() {return lastName;}

   // return social security number
   public String getSocialSecurityNumber() {return socialSecurityNumber;}

   // return String representation of Employee object
   @Override
   public String toString() {
      return String.format("%s %s%nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber());
   }
   // implementing getPaymentAmount here enables the entire Employee
   // class hierarchy to be used in an app that processes Payables  
   public abstract double earnings();  
   
   public double getPaymentAmount() {return earnings();};
} 

