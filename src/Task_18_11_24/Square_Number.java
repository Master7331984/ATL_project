package Task_18_11_24;

import java.util.Scanner;

public class Square_Number {
    public static void main(String[] args) {

        Digit_Square eded = new Digit_Square();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = scanner.nextInt();
        System.out.println(eded.square(num, sum));


    }

    public static class Digit_Square {
        public int square(int num, int sum ){
             int digit=1;
             for (int i =0; i<sum; i++){
                 digit= num*digit;
             }

             return digit;
        }
    }
}
