package Avto;

public class Car_Parameters  {
    String model;
    String color;
    int speed;

    public Car_Parameters(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayMessage(){
        System.out.println("Model:" + "" +model + " " + "Color:" + "" + color + " " + "Speed:" + "" + speed);
    }
}



