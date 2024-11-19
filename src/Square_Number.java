import java.util.Scanner;

public class Square_Number {
    public static void main(String[] args) {

        Digit_Square eded = new Digit_Square();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = scanner.nextInt();
        System.out.println(eded.square(num, sum));


    }
}
