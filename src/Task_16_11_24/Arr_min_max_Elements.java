package Task_16_11_24;

import java.util.Scanner;
public class Arr_min_max_Elements {
    public static void main(String[] args) {
        System.out.println("Eded daxil edin");
        Scanner scan = new Scanner(System.in);
        int[] arr_size = new int [5];
        int min_digit = Integer.MAX_VALUE;
        int max_digit = arr_size[0];

        for (int i=0; i<arr_size.length; i++) {
            arr_size[i] = scan.nextInt();

            if (arr_size[i]<min_digit){
                min_digit = arr_size[i];

            }

            if(max_digit<arr_size[i]) {
                max_digit = arr_size[i];

            }

        } System.out.println("En kicik eded" + " " + min_digit);
          System.out.println("En boyuk eded" + " " + max_digit);
    }
}
