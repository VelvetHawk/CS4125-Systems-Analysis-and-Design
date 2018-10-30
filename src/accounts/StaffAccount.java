package accounts;

public class StaffAccount extends Account
{
	protected enum Employee
	{
		EMPLOYEE,
		MANAGER
	}
	
	protected int staffNumber;
	protected Employee employeeType;
	
}
