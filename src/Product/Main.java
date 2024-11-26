package Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Elektronika","Televizor",1000);
        Product product1 = new Product(1,"Elektronika","Televizor",1000);
        Product product2 = new Product(2,"Elektronika","Mobil telefon",1500);
        System.out.println(product.equals(product1));
        System.out.println(product.equals(product2));
        System.out.println(product1.equals(product2));

    }
}
