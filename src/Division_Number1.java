import java.util.Scanner;

public class Division_Number1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ədədi daxil edin:");
        var number = scan.nextInt();

        if(number%3==0 || number%4==0){
            System.out.println("Ədəd tam bölünür");
        }
        else {
            System.out.println("Ədəd tam bölünmür");
        }
    }
}
