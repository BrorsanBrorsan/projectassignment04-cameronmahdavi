package com.assignment_4.interfaces;

/**
 * 
 * 
 * Assignment 4 - Simplified manager system for bank accounts
 * @author Cameron Mahdavi
 * @version 1.0
 * 
 * The interface of the program that uses 2 methods. First method is to see how much 
 * money is withdrawn from the account and the second is to see how much money is deposited 
 * into the account.
 **/

public interface BankOperations {

    public void withdrawMoney(double amount);
    
    
    public void depositMoney(double amount);

}