package com.assignment_4.superclasses;

import com.assignment_4.interfaces.BankOperations;
import java.util.UUID;

/**
 * 
 * Assignment 4 - Simplified manager system for bank accounts
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 *  Superclass BankAccount that implements the interface BankOperations
 **/

public class BankAccount implements BankOperations {
	
	/**
	 * Setting the attributes of the account
	 */    
    private String accountNumber = "";
    private String accountType = "";
    private double balance = 0.0;
    
	/**
	 * Constructor
	 */
    public BankAccount() {
        this.accountNumber = UUID.randomUUID().toString().substring(0,6);
        this.balance = 0;
        this.accountType = "Bank Account";
        }
	/**
	 * Getter
	 */
    public String getAccountNumber() {
        return accountNumber;
	}
    
	/**
	 * Setter
	 */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
	}
    
	/**
	 * Getter
	 */
    public String getAccountType() {
        return accountType;
	}
    
	/**
	 * Setter
	 */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
	}
    
	/**
	 * Getter
	 */
    public double getBalance() {
        return balance;
	}
    
	/**
	 * Setter
	 */
    public void setBalance(double balance) {
        this.balance = balance;
	}
    
	/**
	 * If-loop that is used to withdraw money
	 */
    public void withdrawMoney(double amount) {
        if (amount>=0) {
            setBalance(getBalance() - amount);
        }else {
            System.out.println("You can not withdraw a negative value!");
            }

	}
    
	/**
	 * If-loop that is used to deposit money
	 */
    public void depositMoney(double amount) {
        if (amount>=0) {
            setBalance(getBalance() + amount);
        }else {
            System.out.println("You can not deposit a negative value!");
            }
	}

	/**
	 * Method String toString() that is used to convert the numbers to String
	 * Returns a string with information containing account number, 
	 * account type and the balance on the account.
	 */
    public String toString() {
        return "BankAccount [Account Number= " + accountNumber + ", Account Type= " + accountType + ", Balance= " + balance + "]";
        }

}

    
    




