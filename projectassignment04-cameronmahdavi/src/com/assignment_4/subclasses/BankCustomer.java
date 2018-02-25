package com.assignment_4.subclasses;

import java.util.ArrayList;
import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

/**
 * 
 * Assignment 4 - Simplified manager system for bank accounts
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 * Sub class BankCustomer that inherits the superclass Human
 **/

public class BankCustomer extends Human {

	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * Constructor that calls name and age of the person from the superclass human
	 * using the method super
	 **/ 
	public BankCustomer(String name, int age) {
		super(name, age);
	}
	
	/**
	 * Getter that returns an arraylist of the customer accounts
	 **/
	public ArrayList<BankAccount> getCustomerAccount() {
		return customerAccounts;
	}
	
	/**
	 * Setter used to set the list of the customer account
	 **/
	public void setCustomerAccount(ArrayList<BankAccount> customerAccount) {
		this.customerAccounts = customerAccount;
	}
	
	/**
	 * This adds the bank account to the list
	 **/
	public void addAccount(BankAccount bankAccount) {
		this.customerAccounts.add(bankAccount);
	}
	
	/**
	 * Deposits an amount of money to a specific account 
	 **/
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}
	
	/**
	 * Withdraws an amount of money from a specific account
	 **/
	public void withdrawMoneyFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}
	
	/**
	 * Returns a string with the name and age of the customer and the three different accounts 
	 **/
	public String toString() {
		return "Customer: " + getName() + " age " + getAge() + " \n" + customerAccounts.get(0) + "\n"
				+ customerAccounts.get(1) + "\n" + customerAccounts.get(2) + "\n";
	}
}