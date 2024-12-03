package ArrayMethods;

import java.util.Arrays;

public class ElementsSumAvg {
    public static void main(String[] args) {
        int[] arr = {25, 36 , 54 ,5};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        int avg = sum/arr.length;
        System.out.println(avg);
    }
}
