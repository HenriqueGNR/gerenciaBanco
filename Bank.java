/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tempbank.gerenciabanco;

public final class Bank {
    private int accountNumber;
    private long accountCPF;
    private String accountHolder;
    private double accountBalance;

    public Bank() {
    }

    public Bank(int accountNumber, long accountCPF, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountCPF = accountCPF;
        deposit(initialDeposit);
    }

    public Bank(int accountNumber, long accountCPF, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountCPF = accountCPF;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        accountBalance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber + ", CPF: " + accountCPF + ", Holder: " + accountHolder + ", Balance: $ " + accountBalance;
    }
}