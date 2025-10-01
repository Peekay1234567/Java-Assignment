/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accounttest;

/**
 *
 * @author HP
 */
class Account extends Bank {

    public Account(String accountName, double balance) {
        super(accountName, balance);
    }

    // Deposit adds only valid amount > 0
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
            logTransaction("Deposit", amount, balance);
        } else {
            System.out.println("Invalid deposit amount: " + amount);
        }
    }


    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal amount exceeded account balance");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
            logTransaction("Withdraw", amount, balance);
        } else {
            System.out.println("Invalid withdrawal amount: " + amount);
        }
    }


    @Override
    public double getBalance() {
        return balance;
    }
}

