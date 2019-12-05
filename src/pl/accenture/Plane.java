package pl.accenture;

public class Plane extends Vehicle implements Flying {
    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void callAirControl() {

    }

    @Override
    public double getDistance() {
        return 6;
    }

    @Override
    public double getFuelNeeds() {
        return 12;
    }

    @Override
    public void go() {
        super.go();
        takeOff();
        land();
    }

    @Override
    public void stop() {
        super.stop();
        takeOff();
        land();
    }
}
