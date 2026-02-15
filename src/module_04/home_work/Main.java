package transport;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VehicleFactory factory = null;

        System.out.println("Көлік түрін таңдаңыз:");
        System.out.println("1 - Автокөлік");
        System.out.println("2 - Мотоцикл");
        System.out.println("3 - Жүк көлігі");
        System.out.println("4 - Автобус");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Маркасы: ");
                String brand = scanner.nextLine();

                System.out.print("Моделі: ");
                String model = scanner.nextLine();

                System.out.print("Отын түрі: ");
                String fuel = scanner.nextLine();

                factory = new CarFactory(brand, model, fuel);
                break;

            case 2:
                System.out.print("Типі: ");
                String type = scanner.nextLine();

                System.out.print("Қозғалтқыш көлемі: ");
                int engine = scanner.nextInt();

                factory = new MotorcycleFactory(type, engine);
                break;

            case 3:
                System.out.print("Жүк көтергіштігі: ");
                double capacity = scanner.nextDouble();

                System.out.print("Осі саны: ");
                int axles = scanner.nextInt();

                factory = new TruckFactory(capacity, axles);
                break;

            case 4:
                System.out.print("Жолаушы саны: ");
                int passengers = scanner.nextInt();

                System.out.print("WiFi бар ма? (true/false): ");
                boolean wifi = scanner.nextBoolean();

                factory = new BusFactory(passengers, wifi);
                break;

            default:
                System.out.println("Қате таңдау!");
                System.exit(0);
        }

        IVehicle vehicle = factory.createVehicle();
        vehicle.drive();
        vehicle.refuel();

        scanner.close();
    }
}
