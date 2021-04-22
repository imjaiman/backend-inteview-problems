package com.example.demo.objectOrientedDesign.bankApplication;


import com.example.demo.objectOrientedDesign.bankApplication.bankApplicaionEnum.TransactionType;

/**
 * @author rahul.jaiman
 * @version $Id: Transaction.java, v 0.1 2020-05-19 12:14 rahul.jaiman Exp $$
 */
public class Transaction {

    private String transactionId;
    private double amount;
    private TransactionType type;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
}