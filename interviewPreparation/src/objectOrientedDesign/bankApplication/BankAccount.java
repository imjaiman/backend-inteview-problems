package objectOrientedDesign.bankApplication;


import objectOrientedDesign.bankApplication.Util.BankConstants;
import objectOrientedDesign.bankApplication.bankApplicaionEnum.BankAccountType;
import objectOrientedDesign.bankApplication.bankApplicaionEnum.TransactionType;
import objectOrientedDesign.bankApplication.bankException.BankException;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author rahul.jaiman
 * @version $Id: BankAccount.java, v 0.1 2020-05-19 12:15 rahul.jaiman Exp $$
 */
public abstract class BankAccount {
    private static AtomicInteger TRANSACTION_ID_GENERATOR = new AtomicInteger(0);
    private String accountNumber;
    private long minimumBalance;
    private long currentBalance;
    private double interestRate;
    private List<Transaction> transactions;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(long minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addToTransactions(Transaction transaction) {
        if (transactions == null) {
            transactions = new ArrayList<>();
        }
        transactions.add(transaction);
    }

    public void withdraw(long withdrawAmount) throws BankException {

        // check for the current balance of saving account
        if (this.getType().equals(BankAccountType.SAVING.toString())) {
            if ((currentBalance - withdrawAmount) < BankConstants.SAVING_ACCOUNT_MINIMUM_BALANCE) {
                throw new BankException("Unable to withdraw, Please maintain minimum balance always: " + currentBalance);
            }
        }
        // check for the current balance of current account
        else {
            if ((currentBalance - withdrawAmount) < BankConstants.CURRENT_ACCOUNT_MINIMUM_BALANCE) {
                throw new BankException("Unable to withdraw, Please maintain minimum balance always: " + currentBalance);
            }
        }

        synchronized (this) {
            //update the current balance
            currentBalance = currentBalance - withdrawAmount;

            //create a new transaction and update the add to the Bank Account
            Transaction transaction = new Transaction();
            transaction.setAmount(withdrawAmount);
            String transactionId = BankConstants.WITHDRAW_OPERATION + TRANSACTION_ID_GENERATOR.incrementAndGet();
            transaction.setTransactionId(transactionId);
            transaction.setType(TransactionType.WITHDRAW);
            addToTransactions(transaction);
        }

    }

    public void deposit(long depositAmount) throws BankException {
        if (depositAmount < 0) {
            throw new BankException("Deposit amount should be greater than 0, deposit amount: " + depositAmount);
        }

        synchronized (this) {
            currentBalance = currentBalance + depositAmount;
            Transaction transaction = new Transaction();
            transaction.setAmount(depositAmount);
            String transactionId = BankConstants.DEPOSIT_OPERATION + TRANSACTION_ID_GENERATOR.incrementAndGet();
            transaction.setTransactionId(transactionId);
            transaction.setType(TransactionType.DEPOSIT);
            addToTransactions(transaction);
        }

    }

    public List<Transaction> getTransactionHistory() {
        return transactions;
    }


    //return the latest 10 transactions
    public List<Transaction> getMiniStatement() {
        List<Transaction> miniStatement = new ArrayList<>();
        int count = 0;
        ListIterator<Transaction> listIter = transactions.listIterator(transactions.size());
        while (listIter.hasPrevious()) {
            miniStatement.add(listIter.previous());
            count++;
            if (count > BankConstants.MINI_STATEMENT_COUNT) {
                break;
            }
        }
        return miniStatement;
    }

    public abstract String getType();
}