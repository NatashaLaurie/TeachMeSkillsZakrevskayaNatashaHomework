package lesson4.abstractClasses;

abstract class Transport {
    int enginePower;
    int fullSpeed;
    int weight;
    String brand;
    String model;

    public Transport() {
        this.enginePower = 0;
        this.fullSpeed = 0;
        this.weight = 0;
        this.brand = "not determined";
        this.model = "not determined";
    }

    public Transport(int enginePower, int fullSpeed, int weight, String brand, String model) {
        this.enginePower = enginePower;
        this.fullSpeed = fullSpeed;
        this.weight = weight;
        this.brand = brand;
        this.model = model;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public double getEnginePowerInKilowatts(int enginePower) {
        final double kilowattsIn1HorsePower = 0.74;
        return enginePower * kilowattsIn1HorsePower;
    }

    public int getFullSpeed() {
        return fullSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}