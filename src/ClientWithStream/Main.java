package ClientWithStream;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        var client1 = new Client("Ayxan", 400);
        var client2 = new Client("Afet", 300);
        var client3 = new Client("Sevda", 580);


        ArrayList<Client> list = new ArrayList<>();
        list.add(client1);
        list.add(client2);
        list.add(client3);
        System.out.println(list);
        list.stream()
                .filter(x -> x.getDebtClient()>350)
                .map((x)->{
            double l =  x.getDebtClient()/2;
            double k = x.getDebtClient()+l;
            x.setDebtClient(k);
            return l;
        }).forEach(x-> System.out.println("Faiz: "+x));

        System.out.println(list);


    }
}
