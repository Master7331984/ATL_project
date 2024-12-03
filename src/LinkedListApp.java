import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList();
        list.add("memmed");
        list.add("aysel");
        list.add("Camaleddin");
        String a =list.get(0);
        for (String s: list){
            if (s.length()<a.length()){
                a=s;
            }


        }
        System.out.println(a);

    }
}
