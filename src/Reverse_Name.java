import java.util.Scanner;

public class Reverse_Name {
    static String  cevir (String name) {

        String netice = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            netice += name.charAt(i);
        }
    }

}


