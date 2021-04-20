package com.banking.app;

import org.junit.jupiter.api.*;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionTypeTest {
    private Bank bank;
    private Customer customer;
    private String custID;
    private Account account;
    double creditRating = 0.1;
    static final int PIN = 1234;
    boolean access = false;
    Scanner s = new Scanner(System.in);
    double balance;
    static final double OVERDRAFT_FEE = 25.0;

    // Test a deposit of $10.00 works:
    @Test
    @DisplayName( "Transaction.TransctionType Test" )
    public void getTransactionType() {
        System.out.println("Choose transaction type");
        switch (option) {
            case 1:
                System.out.println("You would like to withdraw");
                System.out.println();
                break;
            case 2:
                System.out.println("You would like to Deposit");
                System.out.println();
                break;
            case 3:
                System.out.println("Your account balance is £" + Account);
                System.out.println();
                break;
            case 4:
                System.out.println("Please wait whilst we perform a credit check.");
                try {
                    checkCreditRating();
                } catch (InterruptedException e) {
                    System.out.println("How embarrassing, the system is currently unavailable. Try again later.");
                }
                System.out.println();
                break;
            case 5:
                System.out.println("Successfully logged out, see you soon!");
                System.out.println();
                return true;
            default:
                System.out.println("Invalid option, please choose another option.");
                System.out.println();
                return false;
        }
        System.out.println("Please choose another option.");
        return false;
    }

    @Test
    @DisplayName("TransactionType.TransactionFee")
    public void testApplyOverDraftFee(){
        balance = balance - OVERDRAFT_FEE;
    }

    @Test
    @DisplayName("Transaction.getDeposit")
    public void testGetDeposit(double amount){
        Account += amount;
    }

    @Test
    @DisplayName("Transaction.Withdrawl")
    public void testWithdrawl(double amount){
        if (Account > amount) {
            System.out.println("Your funds have been successfully withdrawn.");
        } else {
            System.out.println("You don't have the funds to complete this transaction");
        }
    }
}
