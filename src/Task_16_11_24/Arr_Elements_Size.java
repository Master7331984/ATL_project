package Task_16_11_24;

import java.util.Scanner;

public class Arr_Elements_Size {
    public static void main(String[] args) {
        System.out.println("Massive elementleri daxil edin:");
        Scanner scan = new Scanner(System.in);
        int[] arr_size = new int[5];

        for (int i=0; i<arr_size.length; i++){
            arr_size[i] = scan.nextInt();

        }
        System.out.print("Massivin elementleri:" + " ");
        for (int i : arr_size) {
            System.out.print(i + " ");
        }
    }
}
