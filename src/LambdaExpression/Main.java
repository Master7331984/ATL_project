package LambdaExpression;


public class Main {
    public static void main(String[] args) {

    Calculator sum = Integer::sum;
    Calculator dec = (a,b)->a-b;
    Calculator mult = (a,b)->a*b;
    Calculator div = (a,b)->a/b;
        System.out.println(sum.operation(3,56));
        System.out.println(dec.operation(5,98));
        System.out.println(mult.operation(9,15));


    }


}
