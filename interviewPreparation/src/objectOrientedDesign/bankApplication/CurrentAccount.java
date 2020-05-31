package objectOrientedDesign.bankApplication;

import objectOrientedDesign.bankApplication.Util.BankConstants;
import objectOrientedDesign.bankApplication.bankApplicaionEnum.BankAccountType;

/**
 * @author rahul.jaiman
 * @version $Id: CurrentAccount.java, v 0.1 2020-05-19 12:15 rahul.jaiman Exp $$
 */
public class CurrentAccount extends BankAccount {

    public static final long MINIMUM_BALANCE = BankConstants.CURRENT_ACCOUNT_MINIMUM_BALANCE;

    public static final double INTEREST_RATE = BankConstants.CURRENT_ACCOUNT_INTEREST_RATE;

    public long getMinimumBalance() {
        return MINIMUM_BALANCE;
    }

    public double getInterestRate() {
        return INTEREST_RATE;
    }

    @Override
    public String getType() {
        return BankAccountType.CURRENT_ACCOUNT.toString();
    }
}