package Task_14_10_24;

import java.util.Scanner;

public class Count_Digits_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var number = scan.nextInt();
        int count = 0;
        while (number>0){
            number= number/10;

            count++;
        }
           System.out.println("Ededin reqem sayı"+" "+ count);





    }
}
