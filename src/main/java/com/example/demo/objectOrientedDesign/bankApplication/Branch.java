package com.example.demo.objectOrientedDesign.bankApplication;

import com.example.demo.objectOrientedDesign.bankApplication.Util.BankConstants;
import com.example.demo.objectOrientedDesign.bankApplication.bankApplicaionEnum.BankAccountType;
import com.example.demo.objectOrientedDesign.bankApplication.bankException.BankException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author rahul.jaiman
 * @version $Id: Branch.java, v 0.1 2020-05-19 12:15 rahul.jaiman Exp $$
 */
public class Branch {
    private static AtomicInteger BRANCH_ID_GENERATOR = new AtomicInteger(0);
    private List<BankAccount> bankAccounts;
    private List<Customer> customers;
    private String branchId;

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount bankAccount) {
        if (bankAccounts == null) {
            bankAccounts = new ArrayList<>();
        }
        bankAccounts.add(bankAccount);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customer) {
        if (customers == null) {
            customers = new ArrayList<>();
        }
        customers.add(customer);
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public void createBankAccount(String panNumber, String bankAccountType, long amount) {


        BankAccount newBankAccount;
        //creating saving account
        if (bankAccountType.equals(BankAccountType.SAVING.toString())) {
            newBankAccount = new SavingAccount();
            newBankAccount.setMinimumBalance(BankConstants.SAVING_ACCOUNT_MINIMUM_BALANCE);
            newBankAccount.setInterestRate(BankConstants.SAVING_ACCOUNT_INTEREST_RATE);
        }
        //creating current account
        else {
            newBankAccount = new CurrentAccount();
            newBankAccount.setMinimumBalance(BankConstants.CURRENT_ACCOUNT_MINIMUM_BALANCE);
            newBankAccount.setInterestRate(BankConstants.CURRENT_ACCOUNT_INTEREST_RATE);
        }

        String newAccountNumber = BankConstants.ZETA_BANK_ACCOUNT_NUMBER_PREFIX + BRANCH_ID_GENERATOR.incrementAndGet();
        newBankAccount.setAccountNumber(newAccountNumber);
        newBankAccount.setCurrentBalance(amount);

        //checking if customer is already present with the pan number.
        Customer alreadyCustomer = customerPresentWithPanNumber(panNumber);

        if (null != alreadyCustomer) {
            alreadyCustomer.setAccounts(newBankAccount);
        } else {
            Customer newCustomer = new Customer();
            newCustomer.setPanNumber(panNumber);
            newCustomer.setAccounts(newBankAccount);
            setCustomers(newCustomer);
        }
        setBankAccounts(newBankAccount);
    }

    public Customer getCustomerByPanNumber(String panNumber) throws BankException {
        for (Customer customer : customers) {
            if (customer.getPanNumber().equals(panNumber)) {
                return customer;
            }
        }
        throw new BankException("No Customer is present with the given pan number: " + panNumber);
    }

    public BankAccount getAccountByAccountNumber(String accountNumber) throws BankException {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                return bankAccount;
            }
        }
        throw new BankException("No account is mapped with this account number: " + accountNumber);

    }

    //returns the customer with the given pancard
    private Customer customerPresentWithPanNumber(String panNumber) {
        if (null != customers) {
            for (Customer customer : customers) {
                if (customer.getPanNumber().equals(panNumber)) {
                    return customer;
                }
            }
        }

        return null;
    }
}