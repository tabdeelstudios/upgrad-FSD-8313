import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleBankingSystem {
    // Instantiate objects and perform necessary setup
    private static AccountService accountService = new AccountService();
    private static Account currentAccount;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Initial menu
        while (true) {
            /**
             * Create Main Menu of the Easy Finance Bank according to the screenshots provided
             * and prompt the user to enter input and get the user's input choice
             */
            // Write your code here
            int choice=0;
            
            System.out.println("=====================");
            System.out.println("Welcome to Easy Finance Bank");
            System.out.println("1. Create Account");
            System.out.println("2. Login to Account");
            System.out.println("3. Quit");
            System.out.println("=====================");
            System.out.println("Enter your choice: ");
                
            choice = scanner.nextInt();
                
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> logIn();
                case 3 -> {
                    System.out.println("Thank you for using Easy Finance Bank. Goodbye!");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    delay();
                }
            }
        }
    }

    private static void createAccount() {
        try {
            // Prompt the user to enter their name and PIN
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();

            // Create account with provided name and PIN and set it as current account
            currentAccount = accountService.createAccount(name, pin);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            scanner.nextLine(); // Clear the invalid input
        }

        // Add 2 seconds wait and perform account operations
        delay();
        performAccountOperations();
    }

    private static void logIn() {
        // Prompt the user to enter their name
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        // Find the account associated with the entered name
        Account oldAccount = accountService.findAccountByName(name);

        // If no account is found for the entered name, display an error message and return
        if (oldAccount == null) {
            System.out.println("Account not found.");
            return;
        }

        // Prompt the user to enter the PIN for the found account
        System.out.print("Enter PIN for " + name + ": ");
        int pin = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Check if the entered PIN matches the PIN associated with the account
        if (pin == oldAccount.getPin()){
            // Proceed with account operations if PIN is matched
            currentAccount = oldAccount;
            performAccountOperations();
        }
        else {
            // Display an error message if PIN is not matched
            System.out.println("PIN does not match!");
        }

        // Add 2 seconds wait
        delay();
    }

    private static void performAccountOperations() {
        while (true) {
            /**
             * Create Account Services Menu of Easy Finance Bank according to the screenshots provided
             * and prompt the user enter input and get the user's input choice
             */
            // Write your code here

            int choice=0;
            
            System.out.println("=====================");
            System.out.println("Welcome to Easy Finance Bank");
            System.out.println("1. Display Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Display Account Info");
            System.out.println("6. Logout to Main Menu");
            System.out.println("=====================");
            System.out.println("Enter your choice: ");

            choice = scanner.nextInt();

            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1 -> showBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> transfer();
                case 5 -> {
                    accountService.showAccountInfo(currentAccount);
                    delay();
                }
                case 6 -> {
                    // Log out the current user by setting the currentAccount to null
                    currentAccount = null;
                    return;
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    delay();
                }
            }
        }
    }

    private static void showBalance() {
        System.out.println("Current Balance: $" + accountService.showBalance(currentAccount));

        // Add 2 seconds wait
        delay();
    }

    private static void deposit() {
        try {
            System.out.print("Enter amount to deposit: $");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            accountService.deposit(currentAccount, amount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            scanner.nextLine(); // Clear the invalid input
        }

        // Add 2 seconds wait
        delay();
    }

    private static void withdraw() {
        try {
            System.out.print("Enter amount to withdraw: $");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            accountService.withdraw(currentAccount, amount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            scanner.nextLine(); // Clear the invalid input
        }

        // Add 2 seconds wait
        delay();
    }

    private static void transfer() {
        System.out.print("Enter recipient's name: ");
        String recipientName = scanner.nextLine();

        Account recipientAccount = accountService.findAccountByName(recipientName);
        if (recipientAccount == null) {
            System.out.println("Recipient account not found.");
            delay();
            return;
        }

        try {
            System.out.print("Enter amount to transfer: $");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            accountService.transfer(currentAccount, recipientAccount, amount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            scanner.nextLine(); // Clear the invalid input
        }

        // Add 2 seconds wait
        delay();
    }

    // Method to add a delay of 2 seconds
    private static void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}