package Task_10_11_24;

import java.util.Scanner;

public class Check_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ədədi daxil edin:");
        var number = scan.nextInt();
        if(number>0){
            System.out.println("Müsbət ədəd");
        }
        else if(number==0) {
            System.out.println("Sıfır");

        }
        else {
            System.out.println("Mənfi ədəd");
        }
    }
}
