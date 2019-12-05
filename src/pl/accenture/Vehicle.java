package pl.accenture;

public abstract class Vehicle {
    private String name;


    public Vehicle(String name) {
        this.name = name;
    }

    public String toString(){
        return  "Imie: " + name ;
    }

    public abstract double getDistance();
    public abstract double getFuelNeeds();

    public double calculateFuelConsumption(){
        return getFuelNeeds()/getDistance();
    }

    public void go(){
        System.out.println("Rodzaj pojazdu: " + getClass().getSimpleName() + " Nazwa pojazdu: " + name + " Wydajność: "
                + calculateFuelConsumption());
    }

    public void stop(){
        System.out.println("Rodzaj pojazdu: " + getClass().getSimpleName() + " Nazwa pojazdu: " + name+ " Wydajność: "
                + calculateFuelConsumption());
    }
}
