import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " is registered in bank");
    }
}
