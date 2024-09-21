public class ArrayListDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer john = new Customer(1, "John", 1000);
        Customer jane = new Customer(2, "Jane", 5000);
        Customer david = new Customer(3, "David", 5000);

        bank.addCustomer(john);
        bank.addCustomer(jane);
        bank.addCustomer(david);

        System.out.println("\nCustomers:");
        bank.displayCustomers();

        // Remove a customer
        bank.removeCustomer(1);
        System.out.println("\nAfter removing, we have: ");
        bank.displayCustomers();

        Customer temp = bank.findCustomer(3);
        if(temp!=null){
            System.out.println("\nFound Customer: "+temp);
        } else {
            System.out.println("Customer not found");
        }
    }
}