package Task_16_11_24;

import java.util.Scanner;

public class Arr_Sum_Avg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        double sum=0;
        for (int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
            sum = sum +arr[i];

            arr[i]++;


        }

        int say = (int) sum;
        System.out.println("Ededlerin cemi" + say);
        System.out.println("Ededin sayi" + sum/5);
    }
}
