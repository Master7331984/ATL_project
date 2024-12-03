package Interface_Example;

public class Car implements Vehicle {
boolean hasFuel=true;

    @Override
    public void startEngine() {
        System.out.println("Avtomobilin muherriki ishe dushdu");
    }

    @Override
    public void stopEngine() {
        System.out.println("Avtomobilin muherriki sonduruldu");

    }

    @Override
    public String getFuelType() {

        return "benzin";


    }

    @Override
    public String getEnergyType() {
        return "electric";
    }
    public boolean checkFuel(){
        return hasFuel;
    }
    public void startCar(){
        if(checkFuel()){
            System.out.println("Avto ishe dushmeye hazirlashir");
            startEngine();
        } else System.out.println("benzin yoxdur");
    }
}
