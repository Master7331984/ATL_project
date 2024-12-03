package BankApp;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Akif","1",10);
        BankCustomers bankCustomers = new BankCustomers(customer1);

        try {
            System.out.println("Cari balans: " + bankCustomers.checkBalance());
            bankCustomers.addBalance(300);
            System.out.println("Cari balans: "  + bankCustomers.checkBalance());
            bankCustomers.Pay(100);
            System.out.println("Cari balans: " + bankCustomers.checkBalance());
            bankCustomers.refund(50);
            System.out.println("cari balans: " + bankCustomers.checkBalance());
            bankCustomers.Pay(-1000);

        } catch (Exception e){
            System.out.println("Xeta: " + e.getMessage());
        }



    }
}
