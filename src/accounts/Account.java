package accounts;

public abstract class Account
{
	protected String name;
	protected String surname;
	protected String username;
	protected String password;
	protected String phone;
	protected String address;
	
	Account()
	{
	
	}
	
	Account(String name, String surname, String username, String password, String phone, String address)
	{
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	
}
