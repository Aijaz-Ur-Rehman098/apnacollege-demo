public class ElectricCar extends Car {
    private double batteryCapacity; // in kWh

    public ElectricCar(String make, String model, double price, double batteryCapacity) {
        super(make, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        System.out.println("ElectricCar: Press the power button to start.");
    }

    @Override
    public void accelerate() {
        System.out.println("ElectricCar: Smooth acceleration with electric power.");
    }
    @Override
    public void brake() {
        System.out.println("ElectricCar: Regenerative braking activated.");
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}