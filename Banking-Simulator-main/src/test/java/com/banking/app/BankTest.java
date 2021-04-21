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



    @BeforeEach
    @DisplayName("bankCreate Tests")
    void setUp () {
        bank = new Bank( "My Bank" );
        custID = bank.addCustomer("Piffl", "Hymie");
        Customer customer = bank.getCustomer( custID );
        Account savings = customer.addSavingsAccount( 0.00, "Test Account" );
    }

    @Test
    @DisplayName("simulation Start")
    void Start(){
        Bank.main();
    }

    @Test
    @DisplayName("getters and setter insafisantPenalty Test")
    void brokeBoi(){
        if(account.balance<0){
            bank.setInsufficientFundsPenalty(10);
            double total = bank.getInsufficientFundsPenalty();
            System.out.println("your broke and now have a penalty of"+total+" dollars");
        }
    }

    @Test
    @DisplayName("Return name Test")
    String Bankname(){
        String bankName = bank.getNAME();
        assertEquals(custID, bank);
    }

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


    @Test
    @DisplayName("Get all accounts test")
    Void getAllAccounts(){
        bank.getAllAccounts();
        assertEquals(assertNotNull(accountWizardadd());
    }

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

    @Test
    @DisplayName("removeCustomer test")
    void RemoveCustomer() {
        bank.removeCustomer(custID);
    }

    @Test
    @DisplayName("getAllCustomers test")
    void GetAllCustomers(){
        bank.getAllCustomers();
        assertEquals(assertNotNull(bank);
    }

    @Test
    @DisplayName("getCustomer test")
    void GetCustomer(){
        List Expected = new ArrayList();
        Expected.add(bank.getCustomer(custID));
        assertEquals(Expected);
    }

    @Test
    @DisplayName("getCustomerOBJ test")
    void GetCustomerOBJ(){
        List Expected = new ArrayList();
        Expected = bank.getCustomer("Piffl","Hymie");
        assertEquals(Expected);
    }

    @Test
    @DisplayName("return customer accounts test")
    void returnAccounts(){
        List Expected = new ArrayList();
        Expected = bank.getCustomersAccounts(custID);
        assertEquals(Expected);
    }




}
