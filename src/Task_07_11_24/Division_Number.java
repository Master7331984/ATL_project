package Task_07_11_24;

import java.util.Scanner;

public class Division_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ədədi daxil edin:");
        var number= scan.nextInt();
        if (number%4==0 && number%6==0){
            System.out.println("Ədəd tam bölünür");
        }
        else {
            System.out.println("Ədəd tam bölünmür");
        }

    }
}
