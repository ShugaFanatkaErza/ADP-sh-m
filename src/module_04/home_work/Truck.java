package transport;

public class Truck implements IVehicle {

    private double loadCapacity;
    private int axles;

    public Truck(double loadCapacity, int axles) {
        this.loadCapacity = loadCapacity;
        this.axles = axles;
    }

    @Override
    public void drive() {
        System.out.println("Жүк көлігі жүріп жатыр. Жүк көтергіштігі: " + loadCapacity + " тонна.");
    }

    @Override
    public void refuel() {
        System.out.println("Осі саны: " + axles);
    }
}
