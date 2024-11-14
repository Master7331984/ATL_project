import java.util.Scanner;

public class Payment_Discount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Məbləği daxil edin:");
        var pay = scan.nextInt();

        if(pay>=50 && pay<300){
            System.out.println("Endirimli məbləğ:"+ " "+ (pay-5*pay/100));

        }
        else if (pay>=300 && pay<600){
            System.out.println("Endirimli məbləğ:"+" "+ (pay-10*pay/100));
        }
        else if (pay>=600 && pay<1000) {
            System.out.println("Endirimli məbləğ:"+ " "+ (pay-15*pay/100));

        }
        else if (pay>=1000){
            System.out.println("Endirimli məbləğ:"+ " "+ (pay-20*pay/100));
        }
        else{
            System.out.println("Aldığınız məbləğə endirim yoxdur!");
        }

    }
}
