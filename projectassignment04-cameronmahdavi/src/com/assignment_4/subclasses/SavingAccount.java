package com.assignment_4.subclasses;

import java.util.UUID;
import com.assignment_4.superclasses.BankAccount;

/**
 * 
 * Assignment 4 - Simplified manager system for bank accounts
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 * Subclass SavingAccount that inherits the superclass BankAccount
 **/

public class SavingAccount extends BankAccount {
	
	/**
	 * Constructor that randomly creates an account number to the account "Saving Account" 
	 **/    
    public SavingAccount() {
        this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
        this.setBalance(0.0);
        this.setAccountType("Saving Account");
    }
    
}
