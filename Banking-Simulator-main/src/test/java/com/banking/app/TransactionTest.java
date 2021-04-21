package com.banking.app;

import org.junit.jupiter.api.*;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionTest {
    private Bank bank;
    private Customer customer;
    private String custID;
    private Account account;
    double creditRating = 0.1;
    static final int PIN = 1234;
    boolean access = false;
    Scanner s = new Scanner(System.in);
    double balance;
    // Test Fixture:
    @BeforeEach
    void setUp () {
        bank = new Bank("My Bank");
        custID = bank.addCustomer("Piffl", "Hymie");
        Customer customer = bank.getCustomer(custID);
        SavingsAccount s1 = new SavingsAccount(customer, 0.00, "TestAccount");
    }

    @Test
    @DisplayName("Transaction.getAccount")
    public void getAccountBalance(){
        return Account;
    }
    @Test
    @DisplayName("Transaction.getAccountBalance")
    public double getBalance()	// note "accessor" method
    {
        return balance;

    }

    @Test
    @DisplayName("Transacion.transferFunds")
    public void testTransfer(){
        public void transferFundsA(Account, double amount){
            balance = balance + amount;
            this.balance = this.balance - amount;
        }
    }

}

