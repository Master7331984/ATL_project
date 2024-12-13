package InterfaceWithFunction;

public class Main {
    public static void main(String[] args) {

        Factional<Integer, Boolean> func1 = t -> t%2==0;
        System.out.println(func1.func(5));

        BiFunctional<Integer, Integer,Boolean> func2 = (t, u) -> t<u;
        System.out.println(func2.func(18,50));

        Predicate<Integer> func3 = t-> t<20;
        System.out.println(func3.age(22));




    }


}
