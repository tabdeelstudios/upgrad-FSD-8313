abstract class Account {
    int personAge;
    String personName="John";
    String personAddress;

    void showDetails(){
        System.out.println(personName);
    }
}

class SavingsAccount extends Account{
    String accountType = "Savings";
}

class CurrentAccount extends Account{
    String accountType = "Current";
}

public class BankAccount{
    public static void main(String args[]){
        SavingsAccount myAccount = new SavingsAccount();
        myAccount.showDetails();
        
    }
}
