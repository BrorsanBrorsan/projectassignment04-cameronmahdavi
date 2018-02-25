package com.assignment_4.superclasses;

/**
 * 
 * Assignment 4 - Simplified manager system for bank accounts
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 * Superclass Human that gets and sets the name and age of the customer
 **/
public class Human {

	/**
	 * Setting the attributes of the customer called name and age 
	 */
	private String name;
	private int age;

	/**
	 * Constructor using the parameters name and age to be able to set the name and age of the customer
	 */
	public Human(String name, int age) {
		this.name = name;
		this.age = age;

	}

	/**
	 * Getter that returns the name of the person
	*/
	public String getName() {
		return name;
	}

	/**
	 * Setter that sets the name of the person
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * Getter that returns the age of the person
	*/
	public int getAge() {
		return age;
	}

	/**
	 * Setter that sets the age of the person
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
