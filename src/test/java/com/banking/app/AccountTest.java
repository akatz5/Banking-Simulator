package com.banking.app;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Bank bank;
    private Customer customer;
    private String custID;
    private Account account;

    // Test Fixture:
    @BeforeEach
    void setUp () {
        bank = new Bank( "My Bank" );
        custID = bank.addCustomer("Piffl", "Hymie");
        Customer customer = bank.getCustomer( custID );
        Account savings = customer.addSavingsAccount( 0.00, "Test Account" );
    }

    // Test a deposit of $10.00 works:
    @Test
    @DisplayName("Account.deposit Tests")
    void depositShouldIncreaseBalance () {
        final double initialBalance = account.getBalance();
        final double amount = 10.00;
        account.deposit( amount );
        final double finalBalance = account.getBalance();
        assertEquals( finalBalance, initialBalance + amount,
                "Balance should be " +
                        (initialBalance+amount) + "but was " + finalBalance );
    }
}
