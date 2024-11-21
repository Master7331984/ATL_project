package Task_10_11_24;

import java.util.Scanner;

public class Week_Days {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Həftənin günü:");
        var day = scan.nextInt();

        switch (day){
            case 1:
                System.out.println("Bazar ertəsi");
                break;
            case 2:
                System.out.println("Çərşənbə axşamı");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;
            case 6:
                System.out.println("Şənbə");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Həftə günü mövcud deyil!");


        }
    }
}
