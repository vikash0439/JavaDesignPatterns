package com.patterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
	
	private String productName;
	
	private boolean available;
	
	private List<Observer> oList = new ArrayList<Observer>();

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if(available == true){
			notifyObserver();
		}
	}

	public List<Observer> getoList() {
		return oList;
	}

	public void setoList(List<Observer> oList) {
		this.oList = oList;
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		oList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		oList.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer: oList){
			observer.update(productName);
		}
	}

}
