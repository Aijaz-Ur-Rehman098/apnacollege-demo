public class SportsCar extends Car {
    private double topSpeed; // in km/h

    public SportsCar(String make, String model, double price, double topSpeed) {
        super(make, model, price);
        this.topSpeed = topSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportsCar: Turn the key or push the button to ignite the engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("SportsCar: Quick and powerful acceleration!");
    }

    @Override
    public void brake() {
        System.out.println("SportsCar: High-performance brakes applied.");
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
}