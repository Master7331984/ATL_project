package Figures;

public class Main {
    public static void main(String[] args) {
        Fiqurlar dordbucaqli = new Dordbucaq("Dordbucaq",4);
        dordbucaqli.test();
        dordbucaqli.fiqurlar();
        dordbucaqli.displayInfo();
        Fiqurlar ucbucaq = new Ucbucaq("Ucbucaq",3);
        ucbucaq.test();
        ucbucaq.fiqurlar();
        ucbucaq.displayInfo();

    }
}
