package Users;

import java.io.Serializable;

public class PreferredCustomer  extends Customer
								implements Serializable	
{
	/*
	 *Fields
	 *	m_balance holds PreferredCustomer Balance
	 *	m_discount holds PreferredCustomers discount
	 */
	private double m_balance = 0.0;
	private double m_discount = 0.0;
	
	/*
	 * Constructors
	 */
	public PreferredCustomer()
	{
	}
	public PreferredCustomer(String name, String address, String phoneNumber, String customerNumber)
	{
		super(name, address, phoneNumber, customerNumber);
	}
	
	public PreferredCustomer(String name, String phoneNumber, String customerNumber)
	{
		super(name, phoneNumber, customerNumber);
	}
	
	/**
	 * getBalance retrieves balance
	 */
	public double getBalance()
	{
		/*
		 * return in DollarFormat
		 */
		return m_balance;
	}
	/**
	 * setBalance sets the balance
	 * after every balance update, set discount
	 */
	public void setBalance(double balance)
	{
		m_balance = balance;
		setDiscount();
	}
	/**
	 * getDiscount returns preferred members discount rate
	 */
	public double getDiscount()
	{
		return m_discount;
	}
	
	/**
	 * Set discount method gives the preferred customer a discount on all future
	 * dependent on how much they have spent at business.
	 */
	public void setDiscount()
	{
		if(m_balance >= 500)
		{
			m_discount = .05;
		}
		if(m_balance >= 1000)
		{
			m_discount = .06;
		}
		if(m_balance >= 1500)
		{
			m_discount = .07;
		}
		if(m_balance >= 2000)
		{
			m_discount = .1;
		}
	}
	
	public String toString()
	{
		String str;
		
		str = "Preferred Customer"
				+ "\nName: " + getName()
				+ "\nAddress: " + getAddress()
				+ "\nPhone Number: " + getPhoneNumber()
				+ "\nBalance: " + getBalance()
				+ "\nDiscount: " + getDiscount();
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	
}
