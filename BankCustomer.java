
public class BankCustomer {
    private String custName;
    private int customerId;
    private String customerAddress;

    public BankCustomer(String custName, int customerId, String customerAddress) {
        this.custName = custName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name is: " + custName);
        System.out.println("Customer ID is: " + customerId);
        System.out.println("Customer Address is: " + customerAddress);
    }

    public static void main(String[] args) {
        BankCustomer c = new BankCustomer("Misbha", 1, "Hubli-20");
        c.displayCustomerDetails();
    }
}
