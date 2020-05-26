package objectOrientedDesign.bankApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahul.jaiman
 * @version $Id: Customer.java, v 0.1 2020-05-19 12:14 rahul.jaiman Exp $$
 */
public class Customer {
    private List<BankAccount> accounts;
    private String panNumber;

    public List<BankAccount> getBankAccounts() {
        return accounts;
    }

    public void setAccounts(BankAccount bankAccount) {
        if (accounts == null) {
            accounts = new ArrayList<>();
        }
        this.getBankAccounts().add(bankAccount);

    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }
}