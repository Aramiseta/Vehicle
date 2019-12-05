package pl.accenture;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println("Pojazd przybił do portu! \n");
    }

    @Override
    public double getDistance() {
        return 0;
    }

    @Override
    public double getFuelNeeds() {
        return 0;
    }

    @Override
    public void stop() {
        dock();
    }
}
