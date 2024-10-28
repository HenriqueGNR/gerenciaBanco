/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tempbank.gerenciabanco;

import java.util.Locale;
import java.util.Scanner;

public class GerenciaBanco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank account;

        System.out.print("Enter account number (5 digits): ");
        int accNum = sc.nextInt();
        if (String.valueOf(accNum).length() != 5) {
            System.out.print("Please insert only 5 digits, exiting...");
            System.exit(1);
        }

        System.out.print("Enter the account holder name: ");
        sc.nextLine();
        String accHolder = sc.nextLine();

        System.out.print("Enter your CPF (11 digits): ");
        long accCPF = sc.nextLong();
        if (String.valueOf(accCPF).length() != 11) {
            System.out.print("Please insert only 11 digits, exiting...");
            System.exit(2);
        }

        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Bank(accNum, accCPF, accHolder, initialDeposit);
        } else account = new Bank(accNum, accCPF, accHolder);

        System.out.println();
        System.out.print("Account data: ");
        System.out.println(account);

        int option;

        while (true) {
            System.out.println("What do you want to do? ");
            System.out.println("[1] - Show account info");
            System.out.println("[2] - Deposit");
            System.out.println("[3] - Withdraw");
            System.out.println("[4] - Exit");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Updated account data: ");
                    System.out.println(account);
                    break;
                case 2:
                    System.out.print("Enter a deposit value: ");
                    double depositValue = sc.nextDouble();
                    account.deposit(depositValue);
                    break;
                case 3:
                    System.out.print("Enter a withdraw value (5$ tax): ");
                    double withdrawValue = sc.nextDouble();
                    account.withdraw(withdrawValue);
                    break;
                case 4:
                    System.out.println("Thank you for your preference");
                    System.out.println("Exiting the bank app...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}