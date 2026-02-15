package transport;

public class BusFactory extends VehicleFactory {

    private int passengerCapacity;
    private boolean hasWiFi;

    public BusFactory(int passengerCapacity, boolean hasWiFi) {
        this.passengerCapacity = passengerCapacity;
        this.hasWiFi = hasWiFi;
    }

    @Override
    public IVehicle createVehicle() {
        return new Bus(passengerCapacity, hasWiFi);
    }
}
