package com.patterns.behaviour.observer;

public class ObserverPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer();
		c1.setCustomerName("Vikash");
		
		Customer c2 = new Customer();
		c2.setCustomerName("Suman");
		
		
		Product iphone = new Product();
		iphone.setProductName("Apple iPhone 6");
		iphone.setAvailable(false);
		iphone.registerObserver(c1);
		iphone.registerObserver(c2);
		
		iphone.setAvailable(true);
		
		System.out.println("Vikash brought it offline and deregister for product ");
		iphone.removeObserver(c1);
		iphone.setAvailable(true);

	}

}
