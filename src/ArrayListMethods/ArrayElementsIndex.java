package ArrayListMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayElementsIndex {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        digits.add(0,22);
//        digits.add(1,65);
//        digits.add(2,95);
//        digits.add(3,55);
//        digits.add(4,13);
        for (int i=0; i<5; i++){
            digits.add(scanner.nextInt());


        }
        System.out.println(digits.indexOf(11));
        System.out.println(digits);


    }
}
