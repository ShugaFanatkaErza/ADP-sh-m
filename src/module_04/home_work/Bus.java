package transport;

public class Bus implements IVehicle {

    private int passengerCapacity;
    private boolean hasWiFi;

    public Bus(int passengerCapacity, boolean hasWiFi) {
        this.passengerCapacity = passengerCapacity;
        this.hasWiFi = hasWiFi;
    }

    @Override
    public void drive() {
        System.out.println("Автобус жүріп жатыр. Сыйымдылығы: " + passengerCapacity);
    }

    @Override
    public void refuel() {
        System.out.println("WiFi: " + (hasWiFi ? "Бар" : "Жоқ"));
    }
}
