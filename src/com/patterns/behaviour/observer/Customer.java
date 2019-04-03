package com.patterns.behaviour.observer;

public class Customer implements Observer{
	
	private String customerName;
	private String subject;

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public void update(String productName) {
		// TODO Auto-generated method stub
		System.out.println("Hi "+ customerName + ", Product "+ productName + " is Available online now. ");
		
	}

}
