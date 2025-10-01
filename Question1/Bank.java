/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accounttest;

/**
 *
 * @author HP
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class Bank {
    protected String accountName;
    protected double balance;

    public Bank(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract double getBalance();


    protected void logTransaction(String transactionType, double amount, double balance) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String now = dtf.format(LocalDateTime.now());
        String logMessage = now + " | " + accountName + " | " + transactionType + " | Amount: " + amount + " | Balance: " + balance;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Bank.txt", true))) {
            writer.write(logMessage);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to Bank.txt: " + e.getMessage());
        }
    }
}
