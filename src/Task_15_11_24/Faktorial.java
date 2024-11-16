package Task_15_11_24;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eded daxil edin:");
        var a = scan.nextInt();
        int i=1;
        int n=a;
        long fakt=1;
        while (i<=n){
            fakt = fakt*i;
            i++;
            if (a==0){
                System.out.println("0!=" + (fakt=1));
            }

        }
        System.out.println(fakt);
    }
}
