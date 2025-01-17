public abstract class Car {
    private String make;
    private String model;
    private double price;

    // Constructor
    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    // Abstract methods
    public abstract void start();
    public abstract void accelerate();
    public abstract void brake();

    // Getters and setters (Encapsulation)
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}