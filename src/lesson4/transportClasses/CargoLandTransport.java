package lesson4.transportClasses;


import lesson4.abstractClasses.LandTransport;

public class CargoLandTransport extends LandTransport {
    int liftingCapacity;

    public CargoLandTransport() {
        this.liftingCapacity = 0;
    }

    public CargoLandTransport(int enginePower, int fullSpeed, int weight,
                              String brand, String model, int numberOfWheels,
                              double fuelConsumption, int liftingCapacity) {
        super(enginePower, fullSpeed, weight, brand, model, numberOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void display() {
        System.out.printf(this.getClass().getName() +
                        "\nEngine power: %s (horse power), %s (kilowatts)\tFull speed: %s (km/h)\t" +
                        "Weight: %s (kg)\tBrand: %s\tModel: %s\t" +
                        "Number of wheels: %s\tFuel consumption: %s (L/100km)\t" +
                        "Lifting capacity: %s (tons)\n",
                super.getEnginePower(), getEnginePowerInKilowatts(super.getEnginePower()),
                super.getFullSpeed(), super.getWeight(), super.getBrand(), super.getModel(),
                super.getNumberOfWheels(), super.getFuelConsumption(), this.getLiftingCapacity());
    }

    public void possibilityToLoad(int weightOfCargo) {
        if (weightOfCargo > this.getLiftingCapacity()) {
            System.out.println("You need a bigger truck!!!");
        } else System.out.println("Truck loaded");
    }
}