package pl.accenture;

public class Car extends Vehicle {


    public Car(String name) {
        super(name);
    }

    @Override
    public double getDistance() {
        return 6;
    }

    @Override
    public double getFuelNeeds() {
        return 12;
    }

}
