package Task_07_11_24;

import java.util.Scanner;

public class Student_Point {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Balı daxil edin:");
        var point= scan.nextInt();

        if (point>90 && point<=100){
            System.out.println("A");
        }
        else if (point>80 && point<91) {
            System.out.println("B");
        }
        else if (point>70 && point<81){
            System.out.println("C");
        }
        else if (point>60 && point<71){
            System.out.println("D");
        }
        else if (point>50 && point<61) {
            System.out.println("E");
        }
        else if (point<51) {
            System.out.println("F");
        }
        else {
            System.out.println("Bal qiymətləndirmə aralığında deyil!");
        }

    }
}
