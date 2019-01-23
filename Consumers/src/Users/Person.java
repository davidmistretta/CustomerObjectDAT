package Users;

/*
 * Super Class for Customers
 */
public class Person
{
	/*
	 * Fields
	 */
	private String m_name, m_address, m_phoneNumber;
	/*
	 * Constructor
	 * 	*Future: Add Contructors Person(name), Person(address), Person(PhoneNumber)...
	 */
	public Person(String name, String address, String phoneNumber)
	{
		m_name = name;
		m_address = address;
		m_phoneNumber = phoneNumber;
	}
	public Person(String name, String phoneNumber)
	{
		m_name = name;
		m_phoneNumber = phoneNumber;
		m_address = "Customer address not on record.";
	}
	public Person() 
	{
		System.out.println("Person no arg construct");
		m_name = "";
		m_phoneNumber = "";
		m_address = "";
	}
	/*
	 * Methods
	 */
	
	/**
	 * getName retrieves customer name
	 */
	public String getName()
	{
		return m_name;
	}
	/**
	 * getAddress returns customer address
	 */
	public String getAddress()
	{
		return m_address;
	}
	/**
	 * getPhoneNumber returns customer phone number
	 */
	public String getPhoneNumber()
	{
		return m_phoneNumber;
	}
	/**
	 * setName sets the customers name
	 */
	public void setName(String name)
	{
		m_name = name;
	}
	
	/**
	 *  setPhoneNumber in case a customers number changes
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		m_phoneNumber = phoneNumber;
	}
	/**
	 * setAddress in case a customers address changes
	 */
	public void setAddress(String address)
	{
		m_address = address;
	} 
	
}
