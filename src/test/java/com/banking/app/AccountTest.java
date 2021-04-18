package com.banking.app;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    @Test
    @DisplayName("Account.withdraw Tests")
    void withdrawalShouldDecreaseBalance () {
        final double initialBalance = account.getBalance();
        final double amount = 5.00;
        account.withdraw( amount );
        final double finalBalance = account.getBalance();
        assertEquals( finalBalance, initialBalance - amount,
                "Balance should be " +
                        (initialBalance-amount) + "but was " + finalBalance );
    }
    @Test
    @DisplayName("Account.transfer Tests")
    public void testTransfer() {
        Account fromAccount = customer.addSavingsAccount(20.00, "First account");
        Account toAccount = customer.addSavingsAccount(13.00, "Second account");
        final double amount = 5.00;
        String expectedResult = new String();
        account.transfer(fromAccount, toAccount, amount);
        assertEquals( fromAccount.balance , 15,
                "First account balance should be $15 but was" + (fromAccount.balance ));
        assertEquals( toAccount.balance , 18,
                "First account balance should be $18 but was" + (toAccount.balance ) );

    }

    @Test
    @DisplayName( "Account.getAccountDescription Tests")
    public void testGetAccountDescription() {
    account.setAccountDescription("This is a test account description");
    String description= account.getAccountDescription();
    assertEquals( description, "This is a test account description" );
    }

    @Test
    @DisplayName( "Account.setAccountDescription Tests")
    public void testSetAccountDescription() {
        String description = "This is a test account description";
        account.setAccountDescription(description);
        assertEquals( description, account.getAccountDescription() );
    }

    @Test
    @DisplayName( "Account.getTransactions Tests")
    public void testGetTransactions() {
    Transaction t1 = new Transaction(null, 40.00, "Example Description");
    Transaction t2 = new Transaction(null, 46.35, "Another example description");
    List expectedList = new ArrayList();
    expectedList.add(t1);
    expectedList.add(t2);
    List<Transaction> resultList = account.transactions;
    assertEquals(resultList, expectedList);
    }

    @Test
    @DisplayName( "Account.getTransaction Tests")
    public void testGetTransaction() {
    int expectedResult = 234;
    Transaction result = account.getTransaction(expectedResult);
    assertEquals(result.getId(), expectedResult);
    }

    @Test@DisplayName( "Account.getBalance Test")
    public void testGetBalance(){
        account.balance = 4.55;
        Double result = account.getBalance();
        assertEquals(account.balance, result, "Balance should be " + account.balance + "But was " + result);
    }

}
