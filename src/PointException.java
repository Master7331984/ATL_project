import java.util.Scanner;

public class PointException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();


        try {

            if (str==null) {
                throw new NullPointerException("Setir nulldur");
            }

            System.out.println(str.length());
        } catch (NullPointerException e) {

            System.out.println("Xeta tut: " + e.getMessage());
        }
    }
}