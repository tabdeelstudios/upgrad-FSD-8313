class Account{
    private int balance = 0;

    // synchronized method
    public synchronized void deposit(int amount){
        int newBalance = balance + amount;

        // simulate a custom delay
        try{
            Thread.sleep(100);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        balance = newBalance;
        System.out.println(("Deposited "+amount+" , New Balance: "+balance));
    }

    public int getBalance(){
        return balance;
    }
}

class DepositTask implements Runnable{
    private Account myAccount;
    private int amount;

    public DepositTask(Account account, int amount){
        this.myAccount=account;
        this.amount=amount;
    }

    @Override
    public void run() {
        myAccount.deposit(amount);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();

        Thread task1 = new Thread(new DepositTask(myAccount, 100)); // new state
        Thread task2 = new Thread(new DepositTask(myAccount, 500));
        Thread task3 = new Thread(new DepositTask(myAccount, 750));

        task1.start(); // running state
        task2.start(); // running state
        task3.start(); // running state

        // waiting for all threads to finish
        try{
            task1.join();
            task2.join();
            task3.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Final Balance: "+myAccount.getBalance());
    
    }
}
