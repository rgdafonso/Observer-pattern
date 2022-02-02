/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabobserver;

/**
 *
 * @author Roger
 */
public class Person implements Observer{

	String personName;

	public Person(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void update(String availabiliy) {
		
		System.out.println("Olá "+personName+", seu produto está "+availabiliy+" ");
	}
}