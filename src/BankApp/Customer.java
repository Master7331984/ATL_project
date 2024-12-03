package BankApp;

public class Customer {
    private String customerName;
    private String uniId;
    private double balance;

    public Customer(String customerName, String uniId, double balance) {
        this.customerName = customerName;
        this.uniId = uniId;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUniId() {
        return uniId;
    }

    public void setUniId(String uniId) {
        this.uniId = uniId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void updateBalance(double amount){
        this.balance+=amount;
    }
}
