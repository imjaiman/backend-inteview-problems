package objectOrientedDesign.bankApplication.bankException;

/**
 * @author rahul.jaiman
 * @version $Id: BankException.java, v 0.1 2020-05-19 13:50 rahul.jaiman Exp $$
 */
public class BankException extends Exception {
    public BankException(String exception){
        super(exception);
    }
}