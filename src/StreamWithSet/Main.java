package StreamWithSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Madrid");
        set.add("Valletta");
        set.add("Baku");
        set.add("Hanoy");
        set.add("Antananarivu");
        set.add("Kito");
        set.add("Manama");
        set.add("Rabat");

        set.stream()
                .filter(x->x.length()>=5)
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);


    }
}
