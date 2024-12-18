package AnimalComparable;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        var animal1 = new Animal("Monkey", 170,90);
        var animal2 = new Animal("Donkey", 150, 70);
        var animal3 = new Animal("Giraffe", 200, 150);

        var animalist = Arrays.asList(animal1,animal2,animal3);
        System.out.println(animalist);
        Collections.sort(animalist, new AnimalComparator());
        System.out.println(animalist);
    }
}
