package yoonseop_lee_sec008_comp228_exercise1;

public class PieceWorker extends Employee {
	// fields
	int theNumberOfPiece;
	private double wage = 120;
	
	// constructor
		public PieceWorker(int employeeID, String firstName, String lastName,int theNumberOfPiece)
		{
			super(employeeID,firstName,lastName);
			setTheNumberOfPiece(theNumberOfPiece);
		}
		
	// getters and setters
	public int getTheNumberOfPiece() {
		return theNumberOfPiece;
	}
	public void setTheNumberOfPiece(int theNumberOfPiece) {
		if(theNumberOfPiece > 0)
		{
			this.theNumberOfPiece = theNumberOfPiece;
		}
		else
		{
			System.out.println("theNumberOfPiece should not be negative.");
		}
	}
	
	// method 
		public double earnings()
		{
			double employeeCommission = theNumberOfPiece * wage;
			return employeeCommission;
		}
	
	@Override
	public String toString()
	{
		return String.format("%s%n the Number Of Piece: %d", super.toString(), this.getTheNumberOfPiece());	
	}
		
}
