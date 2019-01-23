package Users;

import java.io.Serializable;

public class Customer extends Person
						implements Serializable
{
	/**
	 * serial version UID is used for different versions of customer class. 
	 * for example, if i were to write a customer object to a .dat file
	 * and ten make a change to Customer.java, when I read it back the class
	 * declaration and object may be incompatible. Thus serialVersionUID is to
	 * keep track of the version of the class
	 */
	private static final long serialVersionUID = 1L;
	private String m_customerNumber;
	private boolean m_mailingList = true; //default for customers
	public Customer()
	{
		System.out.println("Customer no arg construc");
		m_customerNumber = "";
	}
	public Customer(String name, String address, String phoneNumber, String customerNumber)
	{
		super(name, address, phoneNumber);
		m_customerNumber = customerNumber;
	}
	public Customer(String name, String phoneNumber, String customerNumber)
	{
		super(name, phoneNumber);
		m_customerNumber = customerNumber;
	}
	
	/**
	 * getCustomerNumber returns customerNumber
	 */
	public String getCustomerNumber()
	{
		return m_customerNumber;
	}
	/**
	 * setCustomerNumber sets customer number
	 */
	public void setCustomerNumber(String customerNumber)
	{
		m_customerNumber = customerNumber;
	}
	/**
	 * setMailingList sets the mailing list
	 */
	public void setMailingList(boolean mailingList)
	{
		m_mailingList = mailingList;
	}
	/**
	 * getMailingList
	 */
	public boolean getMailingList()
	{
		return m_mailingList;
	}
	
	public String toString()
	{
		String str;
		
		str = "Customer"
				+ "\nName: " + getName()
				+ "\nAddress: " + getAddress()
				+ "\nPhone Number: " + getPhoneNumber()
				+ "\nCustomer Number: " + getCustomerNumber();
		return str;
	}
	

}
