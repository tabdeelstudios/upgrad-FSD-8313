import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank(){
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
        System.out.println("Added: "+customer);
    }

    public void removeCustomer(int customerId){
        customers.removeIf(c -> c.getId()==customerId);
        System.out.println("Removed customer with ID: "+customerId);
    }

    public void displayCustomers(){
        if(customers.isEmpty()){
            System.out.println("No customers in the bank");
        } else {
            customers.forEach(System.out::println);
        }
    }

    public Customer findCustomer(int customerId){
        for(Customer c : customers){
            if(c.getId()==customerId){
                return c;
            }
        }
        return null;
    }
}
