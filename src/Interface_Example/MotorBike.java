package Interface_Example;

public class MotorBike implements Vehicle{


    @Override
    public void startEngine() {
        System.out.println("Motosiklin muherriki ishe dushdu");

    }

    @Override
    public void stopEngine() {
        System.out.println("Motosiklin muherriki sonduruldu");

    }

    @Override
    public String getFuelType() {
        return "dizel";
    }

    @Override
    public String getEnergyType() {
        return "electric";
    }
}
