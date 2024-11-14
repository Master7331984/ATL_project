import java.util.Scanner;

public class Check_Long_Year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İli daxil edin:");
        var year = scan.nextInt();
        if (year>=1900 && year<2000 && year%4==0){

            System.out.println("Uzun il");
        }

        else{
            System.out.println("Qısa il");
        }
    }
}
