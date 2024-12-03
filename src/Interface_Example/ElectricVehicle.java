package Interface_Example;

public class ElectricVehicle implements Vehicle {

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public String getFuelType() {
        return "";
    }

    @Override
    public String getEnergyType() {
        return "electric";
    }
}
