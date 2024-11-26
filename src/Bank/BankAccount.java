package Bank;

public class BankAccount {
    private String accountNumber;
    private double balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>=0){
            this.balance = balance;

        } else {
            System.out.println("Balans menfi ola bilmez");
        }
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit (double amount){
        System.out.println("Evvelki balans: " + balance);
        balance = balance+amount;

        System.out.println("Balansiza mebleg elave edildi:" + amount + " " + "Yeni balansiniz:" + balance);


    }

    public void withDraw(double amount){
        if(balance>=amount){
            balance = balance-amount;
            System.out.println("Balansinizdan " + amount + " Mebleg cixildi yekun balans: "+ balance );
        } else {
            System.out.println("Balansinizda kifayet qeder mebleg yoxdur!");
        }

        //System.out.println("Balansinizdan mebleg cixildi:" + balance + " " + "Son balansiniz:" + balance);
    }
    }



