package Interface_Example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.startCar();
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        System.out.println("Avtomobilin muherriki "+car.getFuelType() + " ishledir");
        Vehicle motorbike = new MotorBike();
        motorbike.startEngine();
        motorbike.stopEngine();
        System.out.println("Motosiklin muherriki "+motorbike.getFuelType() + " ishledir");



    }
    }

