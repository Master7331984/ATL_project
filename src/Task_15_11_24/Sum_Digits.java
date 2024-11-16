package Task_15_11_24;

public class Sum_Digits {
    public static void main(String[] args) {
        int a=1;
        int s=0;

        do{
            System.out.println(a);
            s=s+a;
            a++;

        } while(a<10);
        System.out.println("Rəqəmlərin cəmi:"+ " "+s);
    }
}
