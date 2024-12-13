package LinkedArray;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedElements {
    public static void main(String[] args) {
        LinkedList<Integer> digits = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<6; i++){
            digits.add(scanner.nextInt());
        }
        System.out.println("Elements count: " + digits.size());
        System.out.println("First element: " + digits.getFirst());
        System.out.println("Last element: " + digits.getLast());
        System.out.println("Elements is or not: " + digits.contains(scanner.nextInt()));
    }
}
