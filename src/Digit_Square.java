import java.util.Scanner;

public class Digit_Square {
    public int square(int num, int sum ){
         int digit=1;
         for (int i =0; i<sum; i++){
             digit= num*digit;
         }

         return digit;
    }
}





