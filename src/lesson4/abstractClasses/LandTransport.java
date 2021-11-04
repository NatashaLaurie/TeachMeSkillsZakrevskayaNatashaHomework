package lesson4.abstractClasses;

public abstract class LandTransport extends Transport {
    int numberOfWheels;
    double fuelConsumption;

    public LandTransport() {
        this.numberOfWheels = 0;
        this.fuelConsumption = 0;
    }

    public LandTransport(int enginePower, int fullSpeed, int weight,
                         String brand, String model, int numberOfWheels,
                         double fuelConsumption) {
        super(enginePower, fullSpeed, weight, brand, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}