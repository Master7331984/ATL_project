package Figures;

public class Ucbucaq extends Fiqurlar {
    public Ucbucaq(String ad, int teref) {
        super(ad, teref);
    }

    @Override
    void displayInfo() {
                System.out.println("Fiqur:"+ " "+ super.ad);
                System.out.println("Fiqurun terefi:" +" "+ super.teref);

    }

    @Override
    void fiqurlar() {
//        System.out.println("Fiqur ad:"+ " " +super.ad);
//        System.out.println("Fiqur teref:"+ " "+ super.teref);

    }
}
