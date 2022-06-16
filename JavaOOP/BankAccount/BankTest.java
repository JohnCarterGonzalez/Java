public class BankTest {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(null, 0, 0);
        System.out.println("Testing the Bank class");
        System.out.println("Acct No: " + bank.getAccountNumber());
        System.out.println("Checking Balance: " + bank.getCheckingBalance());
        System.out.println("Savings Balance: " + bank.getSavingsBalance());
        System.out.println("Deposit $100 into checking");
        bank.depositChecking(100, bank.getAccountNumber());
        System.out.println("Checking Balance: " + bank.getCheckingBalance());

        System.out.println("Withdraw $50 from checking");
        bank.withdrawChecking(50, bank.getAccountNumber());
        System.out.println("Checking Balance: " + bank.getCheckingBalance());

        // BankAccount bank2 = new BankAccount("12345", 0, 0);

    }
}