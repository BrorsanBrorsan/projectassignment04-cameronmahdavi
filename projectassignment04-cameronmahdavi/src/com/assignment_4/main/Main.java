package com.assignment_4.main;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;

/**
 * * 
 * Assignment 4 - Simplified manager system for bank accounts
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 * Main class
 * 
 **/

 public class Main {

	public static void main(String[] args) {
		String account = "";

		//Constructor that takes in information about the different accounts and print out results 
		BankCustomer bankcustomer = new BankCustomer("Cameron", 32);
		bankcustomer.addAccount(new BankAccount());
		bankcustomer.addAccount(new PersonalAccount());
		bankcustomer.addAccount(new SavingAccount());
		System.out.toString();
		
		//Prints out the deposit of 30 to the first account
		account = bankcustomer.getCustomerAccount().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account");
		bankcustomer.depositToAccount(account, 30.0);
		System.out.println(bankcustomer.toString());
		
		//Prints out the withdrawal of 200 from the first account
		System.out.println("Withdrawning 200.0 to the first account");
		account = bankcustomer.getCustomerAccount().get(1).getAccountNumber();
		bankcustomer.withdrawMoneyFromAccount(account, 200);
		System.out.println(bankcustomer.toString());
		
		//Prints out the deposit of 200 to the first account
		System.out.println("Depositing 200.0 to the first account");
		account = bankcustomer.getCustomerAccount().get(2).getAccountNumber();
		bankcustomer.depositToAccount(account, 200);
		System.out.println(bankcustomer.toString());
	}

}