/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accounttest;

/**
 *
 * @author HP
 */
public class AccountTest{
    public static void main(String[] args) {
        Account acc = new Account("Praise-El Kacha", 1000.0);

        System.out.println("Initial balance: " + acc.getBalance());

        acc.deposit(500);
        System.out.println("Balance after deposit: " + acc.getBalance());

        acc.withdraw(200);
        System.out.println("Balance after withdrawal: " + acc.getBalance());

       /* acc.withdraw(500); // Exceeds balance
        acc.deposit(700); // Invalid deposit */

        System.out.println("Final balance: " + acc.getBalance());
    }
}
