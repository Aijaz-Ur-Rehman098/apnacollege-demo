public class Main {
    public static void main(String[] args) {
        // Create instances of ElectricCar and SportsCar
        Car tesla = new ElectricCar("Tesla", "Model S", 79999.99, 100.0);
        Car ferrari = new SportsCar("Ferrari", "488 GTB", 262000.00, 330.0);

        // Test ElectricCar
        System.out.println("Testing ElectricCar:");
        tesla.start();
        tesla.accelerate();
        tesla.brake();
        System.out.println("Battery Capacity: " + ((ElectricCar) tesla).getBatteryCapacity() + " kWh");
        System.out.println();

        // Test SportsCar
        System.out.println("Testing SportsCar:");
        ferrari.start();
        ferrari.accelerate();
        ferrari.brake();
        System.out.println("Top Speed: " + ((SportsCar) ferrari).getTopSpeed() + " km/h");
    }
}