/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

import java.util.ArrayList;

/**
 *
 * @author Roger
 */
public class Product implements Subject{

	private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String productName;
    private String productType;
    String availability;
    
    
	public Product(String productName, String productType,String availability) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.availability=availability;
	}
	
	public ArrayList<Observer> getObservers() {
		return observers;
	}
	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	public void notifyObservers() {
		System.out.println("Notificaremos quando o produto estiver disponivel");
		 for (Observer ob : observers) {
             ob.update(this.availability );
      }

	}

	public void registerObserver(Observer observer) {
		 observers.add(observer);
		
	}

	public void removeObserver(Observer observer) {
		 observers.remove(observer);
		
	}

}