import java.util.Scanner;

public class SimpleDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a%2==0 || a%3==0 ||a%3==1 || a%5==0){
            System.out.println("Murekkeb eded");
        }
        else{
            System.out.println("Sade eded");
        }

    }
}
