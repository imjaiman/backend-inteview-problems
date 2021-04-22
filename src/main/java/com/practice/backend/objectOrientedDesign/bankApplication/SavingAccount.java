package com.practice.backend.objectOrientedDesign.bankApplication;

import com.practice.backend.objectOrientedDesign.bankApplication.Util.BankConstants;
import com.practice.backend.objectOrientedDesign.bankApplication.bankApplicaionEnum.BankAccountType;

/**
 * @author rahul.jaiman
 * @version $Id: Saving.java, v 0.1 2020-05-19 12:16 rahul.jaiman Exp $$
 */
public class SavingAccount extends BankAccount {

    public static final long MINIMUM_BALANCE = BankConstants.SAVING_ACCOUNT_MINIMUM_BALANCE;

    public static final double INTEREST_RATE = BankConstants.CURRENT_ACCOUNT_INTEREST_RATE;

    public long getMinimumBalance() {
        return MINIMUM_BALANCE;
    }

    public double getInterestRate() {
        return INTEREST_RATE;
    }

    @Override
    public String getType() {
        return BankAccountType.SAVING.toString();
    }
}