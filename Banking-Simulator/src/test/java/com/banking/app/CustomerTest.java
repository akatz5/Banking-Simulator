package com.banking.app;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    private Bank bank;
    private String custID;
    private String firstName;
    private String lastName;
    private Customer customer;
    private Account account;

    // Test Fixture:
    @BeforeEach
    void setUp () {
        bank = new Bank("New Bank");
        custID = bank.addCustomer("Corey", "Waylan");
        lastName = ("Corey");
        firstName = ("Waylan");
        Customer customer = bank.getCustomer(custID);


    }

    // Test getBank works:
    @Test
    @DisplayName("Customer.getBank Test")
    void getBankWorks () {
        String expected = "New Bank";
        assertEquals(bank, expected);
    }

    @Test
    @DisplayName("Customer.getCustomerID Test")
    void getcustIDWorks () {
        String expected = bank.addCustomer("Corey","Waylan");
        assertEquals(custID, expected);

    }

    @Test
    @DisplayName("Customer.getLastName Test")
    public void getLastNameWorks() {
        String expected = "Corey";
        assertEquals(lastName, expected);

    }

    @Test
    @DisplayName( "Customer.getFirstName Test")
    public void getFirstNameWorks() {
        String expected = "Waylan";
        assertEquals(firstName, expected);

    }

    @Test
    @DisplayName( "Customer.getSortedSet<Account> Test")
    public void getSortedSetAccount() {
        customer.getCustomerAccounts();

    }

    @Test@DisplayName( "Customer.getytdFees Test")
    public void getYTDFees(){
        customer.getytdFees();

    }

    @Test@DisplayName( "Customer.getytdIntrests Test")
    public void getYTDIntrests(){
        customer.getytdIntrest();

    }

    @Test@DisplayName( "Customer.addSavingsAccount Test")
    public void addSavingsAccount(){
        addSavingsAccount();

    }

    @Test@DisplayName( "Customer.removeAccount Test")
    public void removeAccount(){
        removeAccount();

    }

    @Test@DisplayName( "Customer.getAccount Test")
    public void getAccountWorks(){
        customer.getAccount();

    }
}
