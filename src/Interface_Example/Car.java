package Interface_Example;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Avtomobil ishe dushdu");
    }

    @Override
    public void stopEngine() {
        System.out.println("Avtomobil muherriki sonduruldu");

    }
}
