package ArrayMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minMaxElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int maxnum = Arrays.stream(arr).max().getAsInt();
        int minnum = Arrays.stream(arr).min().getAsInt();
        System.out.println(minnum);
        System.out.println(maxnum);
    }



}
