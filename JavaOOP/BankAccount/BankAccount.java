import java.util.Random;

/**
 * This class represents a bank account.
 * will recreate some of the common methods of a bank account, displaying
 * account number, checking and savings amount, total amount
 * methods to invoke to deposit and withdraw money from the account, checking
 * the balance of the account, and displaying the history of transactions
 */

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int accountNumberCounter = 0;
    public static double totalBalance = 0;

    private static String genAccountNumber() {
        Random r = new Random();
        String accountNumber = "";
        for (int i = 0; i < 9; i++) {
            accountNumber += r.nextInt(10);
        }
        return accountNumber;
    }

    /**
     * Constructor for the bank account
     * 
     * @param accountNumber
     * @param checkingBalance
     * @param savingsBalance
     * @param transactions
     */
    public BankAccount(String accountNumber, double checkingBalance, double savingsBalance) {
        this.accountNumber = accountNumber;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = BankAccount.genAccountNumber();
        accountNumberCounter++;
    }

    /**
     * Class member 'static' that returns the total number of accounts created
     */

    public static int getNumberAccounts() {
        return accountNumberCounter;
    }

    /**
     * Getter for the account number
     * 
     * @return
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Getter for the checking balance
     * 
     * @return
     */

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    /**
     * Getter for the savings balance
     * 
     * @return
     */
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    /**
     * Method to deposit money into the checking account
     * 
     * @param amountChecking
     */

    public void depositChecking(double amountChecking, String accountNumber) {
        checkingBalance += amountChecking;
    }

    /**
     * Method to withdraw money from the checking account
     * 
     * @param amountChecking
     */
    public void withdrawChecking(double amountChecking, String accountNumber) {
        if (checkingBalance >= amountChecking) {
            checkingBalance -= amountChecking;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    /**
     * Method to deposit money into the savings account
     * 
     * @param amountSavings
     */

    public void depositSavings(double amountSavings, String accountNumber) {
        savingsBalance += amountSavings;
    }

    /**
     * Method to withdraw money from the savings account
     * 
     * @param amountSavings
     */

    public void withdrawSavings(double amountSavings, String accountNumber) {
        if (savingsBalance >= amountSavings) {
            savingsBalance -= amountSavings;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    /**
     * Method to display the total balance of the account
     * 
     * @return
     */

    public double getTotalBalance() {
        return checkingBalance + savingsBalance;
    }

    /**
     * Method to display the account number and information about the account
     * 
     * @return
     */
    public String toString() {
        return "Account Number: " + accountNumber + "/n" + "Checking Balance: " + checkingBalance + "/n"
                + "Savings Balance: " + savingsBalance + "/n" + "Total Balance: " + getTotalBalance();
    }

    /**
     * Method to generate a random account number
     * 
     * @return
     *         Ninja Bonus
     */

}
