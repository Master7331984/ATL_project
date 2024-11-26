package Figures;

public class Dordbucaq extends Fiqurlar {

    public Dordbucaq(String ad, int teref) {
        super(ad, teref);
    }

    @Override
    void displayInfo() {
                System.out.println("Fiqur:"+ " "+ super.ad);
                System.out.println("Fiqurun terefi:" +" "+ super.teref);
    }

    @Override
    void fiqurlar() {
//        System.out.println("Fiqur:"+ " "+ super.ad);
//        System.out.println("Fiqur teref:" +" "+ super.teref);

    }
}
