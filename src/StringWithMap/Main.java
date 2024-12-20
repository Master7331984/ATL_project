package StringWithMap;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> letter = Arrays.asList("Ayxan", "Yaqub");

        List<String> result = letter.stream().map(x-> List.of(x.split("")).toString()).toList();
        System.out.println(result);
    }
}
