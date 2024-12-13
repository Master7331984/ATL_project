package hasMaps;

import java.util.HashMap;

public class MapsMethod {
    public static void main(String[] args) {
        HashMap<Integer, String> numbersOfRegions = new HashMap<>();
        numbersOfRegions.put(1,"Absheron");
        numbersOfRegions.put(2,"Agdam");
        numbersOfRegions.put(10,"Baki");
        numbersOfRegions.put(11,"Beylaqan");
        for (Integer key :numbersOfRegions.keySet()){
            System.out.println(key);


        }System.out.println(numbersOfRegions.containsKey(10));
        for (String name: numbersOfRegions.values()){
            System.out.println(name);
        }
                System.out.println(numbersOfRegions.containsValue("Baki"));
    }
}
