import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("memmed");
        list.add("elnare");
        list.add("Camaleddin");
        String a =list.get(0);
        List<String> list1 = new LinkedList<>();

        for (String s: list){
            if (s.equals(a)){

                System.out.println(s);
            }


        }
        System.out.println(a);
        //System.out.println();

    }
}
