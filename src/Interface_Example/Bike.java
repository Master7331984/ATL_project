package Interface_Example;

public class Bike implements Vehicle{


    @Override
    public void startEngine() {
        System.out.println("Motosiklin muherriki ishe dushdu");

    }

    @Override
    public void stopEngine() {
        System.out.println("Motosiklin muherriki sonduruldu");

    }
}
