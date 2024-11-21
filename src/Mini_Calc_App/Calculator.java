package Mini_Calc_App;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
<<<<<<< HEAD

=======
        
>>>>>>> ff5aa94551bb9e7dce88389788e18059616af6b8
        Scanner scanner = new Scanner(System.in);
        Toplama add = new Toplama();
        int a = add.topla(scanner.nextInt(), scanner.nextInt());
        System.out.println(a);

        Cixma sub = new Cixma();
        int b = sub.cixma(scanner.nextInt(), scanner.nextInt());
        System.out.println(b);

        Vurma mult = new Vurma();
        int c = mult.vurma(scanner.nextInt(), scanner.nextInt());
        System.out.println(c);

        Bolme div = new Bolme();
        double d = div.bolme(scanner.nextDouble(),scanner.nextDouble());
        System.out.println(d);



    }
}
