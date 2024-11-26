package Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1",300);

        bankAccount.deposit(100);
        bankAccount.withDraw(400);
        bankAccount.setBalance(500);

    }
}
