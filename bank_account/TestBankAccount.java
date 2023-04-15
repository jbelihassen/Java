public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1000, 500);
        BankAccount account2 = new BankAccount(5000, 1000);
        
        account1.deposit(200, "checking");
        account2.withdraw(500, "saving");
        
        System.out.println("Account 1 checking balance: $" + account1.getCheckingBalance());
        System.out.println("Account 2 saving balance: $" + account2.getSavingBalance());
        
        account1.viewTotalMoney();
     
        
        System.out.println("Number of accounts: " + BankAccount.getNumberOfAccounts());
    }
}
