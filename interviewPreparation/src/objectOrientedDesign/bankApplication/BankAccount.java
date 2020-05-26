package objectOrientedDesign.bankApplication;

import designProblems.bankApplication.Util.BankConstants;
import designProblems.bankApplication.bankApplicaionEnum.BankAccountType;
import designProblems.bankApplication.bankApplicaionEnum.TransactionType;
import designProblems.bankApplication.bankException.BankException;

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
    private double minimumBalance;
    private double currentBalance;
    private double interestRate;
    private List<Transaction> transactions;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
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

    public void withdraw(double withdrawAmount) throws BankException {

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

    public void deposit(double depositAmount) throws BankException {
        if (depositAmount < 0) {
            throw new BankException("Deposit amount should be greater than 0, deposit amount: " + depositAmount);
        }
        currentBalance = currentBalance + depositAmount;
        Transaction transaction = new Transaction();
        transaction.setAmount(depositAmount);
        String transactionId = BankConstants.DEPOSIT_OPERATION + TRANSACTION_ID_GENERATOR.incrementAndGet();
        transaction.setTransactionId(transactionId);
        transaction.setType(TransactionType.DEPOSIT);
        addToTransactions(transaction);
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