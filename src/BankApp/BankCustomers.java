package BankApp;

public class BankCustomers extends BankOperation implements PaymentService {
    private Customer customer;

    public BankCustomers(Customer customer){
        this.customer = customer;
    }


    @Override
    public void Pay(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Balans kifayet etmir");
        }
        customer.updateBalance((-amount));
        System.out.println("Odenish edildi: " + amount);

    }

    @Override
    public void refund(double amount) {
        if (amount<=0){
            throw new InvalidAmountException("Mebleg sifirdan boyuk olmalidir");
        }
        customer.updateBalance(amount);
        System.out.println("Pul geri qaytarildi: " + amount);
    }


    @Override
    public void addBalance(double amount) {
        if(amount<=0) {
            throw new InvalidAmountException("Mebleg sifirdan boyuk olmalidir");
        }
            customer.updateBalance(amount);
            System.out.println("Balans artirildi: " + amount);


        System.out.println(customer.getBalance());
    }

    @Override
    public double checkBalance() {
        return customer.getBalance();

    }
}
