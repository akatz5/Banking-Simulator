package com.banking.app;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BigBoySimTest {
    private Bank bank;
    private Customer customer;
    private String custID;
    private Account account;
    int i=0;


	//creates test account
    @BeforeEach
    @DisplayName("bankCreate Tests")
    void setUp () {
        bank = new Bank( "My Bank" );
        custID = bank.addCustomer("Piffl", "Hymie");
        Customer customer = bank.getCustomer( custID );
        Account savings = customer.addSavingsAccount( 0.00, "Test Account" );
    }
	//stats simulation
    @Test
    @DisplayName("simulation Start")
    void Start(){
        Bank.main();
    }
	//insafisantPenalty test
    @Test
    @DisplayName("getters and setter insafisantPenalty Test")
    void brokeBoi(){
        if(account.balance<0){
            bank.setInsufficientFundsPenalty(10);
            double total = bank.getInsufficientFundsPenalty();
            System.out.println("your broke and now have a penalty of"+total+" dollars");
        }
    }
	//returns name
    @Test
    @DisplayName("Return name Test")
    String Bankname(){
        String bankName = bank.getNAME();
        assertEquals(custID, bank);
    }
	//add account wizard (gui needed)
    @Test
    @DisplayName("addAccountWizard test")
    String accountWizardadd() {
        int count = 0;
        List accountlist = new ArrayList();
        if(gui = true){
            bank.addAccountWizard();
            accountlist.add(bank);
            count = count + 1;

            if (i = 0,i > count, i++){
                if (accountlist[count] == bank) {
                    System.out.println("ERROR REPEAT ACCOUNT, you dorked up.");
                }
            }
        }
    }

	//gets all accounts
    @Test
    @DisplayName("Get all accounts test")
    Void getAllAccounts(){
        bank.getAllAccounts();
        assertEquals(assertNotNull(accountWizardadd());
    }

	//Adds customer using wizard (need GUI)
    @Test
    @DisplayName("addCustomerWizard test")
    String customerWizardadd() {
        int count = 0;
        List accountlist = new ArrayList();
        if(gui = true){
            bank.addCustomerWizard();
            accountlist.add(custID);
            count = count + 1;

            if (i = 0,i > count, i++){
                if (accountlist[count] == custID) {
                    System.out.println("ERROR REPEAT customer, you dorked up.");
                }
            }
       	}
    }
	
	//remove customer from list
    @Test
    @DisplayName("removeCustomer test")
    void RemoveCustomer() {
        bank.removeCustomer(custID);
    }
	
	//returns all customers
    @Test
    @DisplayName("getAllCustomers test")
    void GetAllCustomers(){
        bank.getAllCustomers();
        assertEquals(assertNotNull(bank);
    }

	//get customer based on ID
    @Test
    @DisplayName("getCustomer test")
    void GetCustomer(){
        List Expected = new ArrayList();
        Expected.add(bank.getCustomer(custID));
        assertEquals(Expected);
    }

	//gets customer based on Last first
    @Test
    @DisplayName("getCustomerOBJ test")
    void GetCustomerOBJ(){
        List Expected = new ArrayList();
        Expected = bank.getCustomer("Piffl","Hymie");
        assertEquals(Expected);
    }

	//returns all customers accounts and puts them in list
    @Test
    @DisplayName("return customer accounts test")
    void returnAccounts(){
        List Expected = new ArrayList();
        Expected = bank.getCustomersAccounts(custID);
        assertEquals(Expected);
    }




}
