package Task_18_11_24;

import java.util.Scanner;

public class Square_Number {
    public static void main(String[] args) {

        Digit_Square digit = new Digit_Square();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int grad = scanner.nextInt();
        System.out.println(digit.square(num, grad));


    }

    public static class Digit_Square {
        public int square(int num, int grad ){
             int digit=1;
             for (int i =0; i<digit; i++){
                 digit= num*digit;
             }

             return digit;
        }
    }
}
