package Figures;

public abstract class Fiqurlar {
    abstract void fiqurlar();
    String ad;
    int teref;

    public Fiqurlar(String ad, int teref) {
        this.ad = ad;
        this.teref = teref;
    }
    abstract void displayInfo();



    public  void test(){
    }
}
