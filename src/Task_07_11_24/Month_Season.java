package Task_07_11_24;

import java.util.Scanner;
public class Month_Season {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month:");
        var month= scan.nextLine();
        var winter1 = "December";
        var winter2 = "January";
        var winter3 = "February";
        var spring1 = "March";
        var spring2 = "April";
        var spring3 = "May";
        var summer1 = "June";
        var summer2 = "July";
        var summer3 = "August";
        var autumn1 = "September";
        var autumn2 = "October";
        var autumn3 = "November";

        switch (month) {
            case "December":
                System.out.println("Winter season:" + " " + winter1);
                break;
            case "January":
                System.out.println("Winter season:" + " " + winter2);
                break;
            case "February":
                System.out.println("Winter season:" + " " + winter3);
                break;
            case "March":
                System.out.println("Spring season:" + " " + spring1);
                break;
            case "April":
                System.out.println("Spring season:" + " " + spring2);
                break;
            case "May":
                System.out.println("Spring season:" + " " + spring3);
                break;
            case "June":
                System.out.println("Summer season:" + " " + summer1);
                break;
            case "July":
                System.out.println("Summer season:" + " " + summer2);
                break;
            case "August":
                System.out.println("Summer season:" + " " + summer3);
                break;

            case "September":
                System.out.println("Autumn season:" + " " + autumn1);
                break;
            case "October":
                System.out.println("Autumn season:" + " " + autumn2);
                break;
            case "November":
                System.out.println("Autumn season:" + " " + autumn3);
                break;

            default:
                System.out.println("Entered month does not exist!");
        }

    }
}
