package objectOrientedDesign.bankApplication;

import designProblems.bankApplication.bankApplicaionEnum.BankAccountType;
import designProblems.bankApplication.bankException.BankException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author rahul.jaiman
 * @version $Id: DriverClass.java, v 0.1 2020-05-19 13:19 rahul.jaiman Exp $$
 */
public class DriverClass {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(0);
    public static <Lis> void main(String[] args) throws BankException {

        HeadOffice headOffice = new HeadOffice();
        int branchId = +ID_GENERATOR.incrementAndGet();

        //Created zeta branch ZB 1
        headOffice.createBranch("ZB"+branchId);
        System.out.println("------- Branch Created, Id: "+ branchId+" -------");


        Branch branch = headOffice.getBranchById("ZB1");

        //Created saving account with amount 100 and customer having Pancard = ABCDE0583F
        branch.createBankAccount("ABCDE0583F", BankAccountType.SAVING.toString(), (double) 100);

        //Created current account with amount 200 and customer having Pancard = ABCDE0583F
        branch.createBankAccount("ABCDE0583F",BankAccountType.CURRENT_ACCOUNT.toString(), (double) 200);

        System.out.println("------- Saving Account Details and Current Account Details for Customer ABCDE0583F ----");
        Customer customer = branch.getCustomerByPanNumber("ABCDE0583F");


        //print all the customer for the bank account
        List<Customer> customerList = branch.getCustomers();

        for(Customer customerTemp : customerList){
            System.out.println(customerTemp.getPanNumber());
        }


        //Get All the bank account for this customer
        List<BankAccount> list = customer.getBankAccounts();

        //Print all the bank accounts and its balance
        for(BankAccount bankAccount : list){
            System.out.println(bankAccount.getAccountNumber()+" | "+bankAccount.getCurrentBalance()+" | "+bankAccount.getType());
        }

        System.out.println();

        BankAccount savingAccount = new SavingAccount();
        savingAccount.deposit(20000);
        savingAccount.deposit(400);
        savingAccount.withdraw(200);
        System.out.println("Saving Balance: "+savingAccount.getCurrentBalance()+" | Account Type: "+savingAccount.getType());

        List<Transaction> miniStatements = savingAccount.getMiniStatement();
        for(Transaction transaction : miniStatements){
            System.out.println(transaction.getTransactionId()+" "+transaction.getType()+" "+transaction.getAmount());
        }



        BankAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(25000);
        currentAccount.deposit(4000);
        currentAccount.withdraw(1000);
        System.out.println("Current Balance: "+currentAccount.getCurrentBalance()+" | Account Type: "+currentAccount.getType());


        BankAccount bankAccount = branch.getAccountByAccountNumber("ZBAN1");
        System.out.println(bankAccount.getAccountNumber()+" "+bankAccount.getCurrentBalance());



    }
}