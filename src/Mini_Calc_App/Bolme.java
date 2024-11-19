package Mini_Calc_App;

public class Bolme {
    public  double bolme(double a, double b){
        double c =0;
        if (b==0) {
             c =  a / b;
            System.out.println("Sıfıra bölmək olmaz!" + c);

        }
        return c;
    }
}
