package Task_07_11_24;

import java.util.Scanner;
public class Month_Season {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month:");
        var month= scan.nextLine();

        switch (month) {
                case "December":
                case "January":
                case "February":
                System.out.println("Winter season");
                break;

                case "March":
                case "April":
                case "May":
                System.out.println("Spring season");
                break;

                case "June":
                case "July":
                case "August":
                System.out.println("Summer season");
                break;

                case "September":
                case "October":
                case "November":
                System.out.println("Autumn season");
                break;

            default:
                System.out.println("Entered month does not exist!");
        }

    }
}
