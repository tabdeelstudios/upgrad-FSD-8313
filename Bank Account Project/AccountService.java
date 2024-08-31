import java.util.List;
import java.util.ArrayList;

public class AccountService {
    private List<Account> accounts;

    // Constructor
    public AccountService(){
        this.accounts = new ArrayList<>();
    }

    /**
     * Implement function to create a new account
     * 1. Initialize a new Account object with 'name' and 'pin'
     * 2. Add it to the 'accounts' list
     * 3. Print a success message, "Account created successfully. Account number: " with the account number
     * 4. Return the newly created account object
     * @return newAccount
     */
    // Method to create a new account
    public Account createAccount(String name, int pin){
        Account newAccount = new Account(name, pin);
        accounts.add(newAccount);
        System.out.println("Account created successfully. Account number: "+newAccount.getAccountNumber());
        return newAccount;
    }

    // Method to display all details of the account
    public void showAccountInfo(Account account) {
        System.out.println("================================");
        System.out.println("=\tAccount Number: " + account.getAccountNumber());
        System.out.println("=\tName: " + account.getName());
        System.out.println("=\tBalance: $" + account.getBalance());
        System.out.println("================================");
    }

    /**
     * Implement function to return the current balance of the account
     */
    public double showBalance(Account account){
        return account.getBalance();
    }

    /**
     * Implement deposit function:
     * 1. Check if the amount to be deposited is less than or equal to 0,
        * if so print "Invalid amount for deposit." and return
     * 2. Otherwise, set the balance of the account to current balance + deposited amount
     * 3. Print "Deposit successful. Updated balance: $" with the current balance
     */
    // Method to deposit funds into the account
    public void deposit(Account account, double amount){
        if(amount<=0){
            System.out.println("Invalid amount for deposit.");
            return;
        }
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful. Updated balance: $"+showBalance(account));
    }

    /** Implement withdraw function:
     * 1. Check if the amount to be withdrawn is less than or equal to 0,
        * if so print "Invalid amount for withdrawal." and return
     * 2. Check if the amount to be withdrawn is greater than the current balance of the account,
        * if so print "Insufficient funds." and return
     * 3. Deduct the withdrawn amount from the account balance and update it to the account
     * 4. Print "Withdrawal successful. Updated balance: $" with the current balance
     */
    // Method to withdraw funds from the account
    public void withdraw(Account account, double amount){
        if(amount<=0){
            System.out.println("Invalid amount for withdrawal.");
            return;
        }
        if(amount>account.getBalance()){
            System.out.println("Insufficient funds.");
            return;
        }
        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdrawal successful. Updated balance: $"+showBalance(account));
    }

    /**
     * 1. Check if the amount to be transferred is less than or equal to 0,
        * if so print "Invalid amount for transfer." and return
     * 2. Check if the amount to be transferred is greater than the current balance of the account,
        * if so print "Insufficient funds for transfer." and return
     * 3. Deduct the transferred amount from the account of the sender
     * 4. Increment the recipient's account with the transferred amount
     * 5. Print "Transfer successful. Updated balance: $" with the current balance of the sender
     */
    // Method to transfer funds from one account to another
    public void transfer(Account senderAccount, Account recipientAccount, double amount){
        if(amount<=0){
            System.out.println("Invalid amount for transfer.");
            return;
        }
        if(amount>senderAccount.getBalance()){
            System.out.println("Insufficient funds.");
            return;
        }
        senderAccount.setBalance(senderAccount.getBalance() - amount);
        recipientAccount.setBalance(recipientAccount.getBalance() + amount);
        System.out.println("Transfer successful. Updated balance: $"+showBalance(senderAccount));
    }

    // Method to get the account using account holder's name
    public Account findAccountByName(String name) {
        for (Account account : accounts) {
            if (account.getName().equals(name)) {
                return account;
            }
        }
        return null;
    }
}
