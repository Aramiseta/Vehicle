package pl.accenture;

public class Test {
    public static void main(String[] args) {


        Vehicle car = new Car("Maybach");
        Vehicle plane = new Plane("Boeing");
        Vehicle raceCar = new RaceCar("Ferrari");
        Vehicle truck = new Truck("truck");


        Vehicle vehicle1[] = {car, plane, raceCar, truck};

        for (Vehicle a : vehicle1) {
            a.go();
            a.stop();
            a.getFuelNeeds();
            if (a instanceof Flying) {
                ((Flying) a).callAirControl();
            }
        }

    }
}