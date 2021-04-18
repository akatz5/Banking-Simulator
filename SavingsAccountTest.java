package com.banking.app;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {
    private Bank bank;
    private Customer customer;
    private String custID;
    private Account account;

    // Test Fixture:
    @BeforeEach
    void setUp () {
        bank = new Bank("My Bank");
        custID = bank.addCustomer("Piffl", "Hymie");
        Customer customer = bank.getCustomer(custID);
        SavingsAccount s1 = new SavingsAccount(customer, 0.00, "TestAccount");
    }

    @Test
    @DisplayName( "SavingsAccount.addInterestTransaction Test")
    public void testAddInterestTransaction(){
        final double initialBalance = 20.00;
        final double amount = .45;
        double finalBalance = (initialBalance * amount) + amount;
        SavingsAccount.addInterestTransaction(amount);
        assertEquals(account.balance, finalBalance);
    }

    @Test
    @DisplayName( "SavingsAccount.setDefaultInterestRate Test")
    public void testSetDefaultInterest(){
        double exampleRate = 2.0;
        SavingsAccount.setDefaultInterestRate(exampleRate);
        assertEquals(SavingsAccount.getDefaultInterestRate(), exampleRate);
    }

    @Test
    @DisplayName( "SavingsAccount.getDefaultInterestRate Test")
    public void testGetDefaultInterest(){
        SavingsAccount.setDefaultInterestRate(3.0);
        double rate = SavingsAccount.getDefaultInterestRate();
        assertEquals(3.0, rate);

    }
}
