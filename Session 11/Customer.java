public class Customer{
    private int id;
    private String name;
    private double balance;

    public Customer(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setId(String name){
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "Customer ID: "+ id + ", Name: "+name+", Balance: "+balance;
    }
}

