public class BankAccount{

      //!! membres variables
   
      private  double checkingBalance;   // Default Value 0.0

      private  double savingBalance;   // Default Value 0.0

      private static int numAccounts   = 0;

      private static double totalAmount  = 0;

     // !! constructor

     public BankAccount(double checkingBalance, double savingBalance) {
        this.checkingBalance = 0.0;
        this.savingBalance = 0.0;
        numAccounts++;
        totalAmount += checkingBalance + savingBalance;

    }
    

    // !! methods

  // !! Deposit money

    public void deposit(double amount, String accountType) {

        if (accountType.equals("checking")) {
            checkingBalance += amount;
        } else if (accountType.equals("saving")) {
            savingBalance += amount;
        }
        totalAmount += amount;
    }


  // !!  Withdraw money


    public void withdraw(double amount, String accountType) {
        if (accountType.equals("checking") && checkingBalance >= amount) {
            checkingBalance -= amount;
            totalAmount -= amount;
        } else if (accountType.equals("saving") && savingBalance >= amount) {
            savingBalance -= amount;
            totalAmount -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }


  //!!  Method to see the total money from the checking and saving


    public void viewTotalMoney() {
        System.out.println("Total Amount: $" + totalAmount);
    }




  //!! 
   public static int getNumberOfAccounts() {
        return numAccounts;
    }

















// !! getters and setters 


    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;        
    }

    
    public double getSavingBalance() {
        return this.savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;        
    }


}