package Task_16_11_24;

import java.util.Scanner;

public class Arr_Elements_Size {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Massive elementleri daxil edin:");
        int[] arr_size = new int[5];

        for (int i=0; i<arr_size.length; i++){
            arr_size[i] = scan.nextInt();

        }
        System.out.print("Massivin elementleri:" + " ");
        for (int j=0; j<arr_size.length; j++){
            System.out.print(arr_size[j] + " ");
        }
    }
}
