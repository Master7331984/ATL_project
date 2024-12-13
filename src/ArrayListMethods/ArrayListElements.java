package ArrayListMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListElements {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList <Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<7; i++){
            digits.add(scanner.nextInt());
        }
        System.out.println(digits.size());
        System.out.println(digits.remove(5));
        System.out.println(digits.remove(3));
        System.out.println(digits);
    }
}
