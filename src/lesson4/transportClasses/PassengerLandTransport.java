package lesson4.transportClasses;

import lesson4.abstractClasses.LandTransport;

public class PassengerLandTransport extends LandTransport {
    String carBodyType;
    int numberOfPassengers;

    public PassengerLandTransport() {
        this.carBodyType = "not determined";
        this.numberOfPassengers = 0;
    }

    public PassengerLandTransport(int enginePower, int fullSpeed, int weight,
                                  String brand, String model, int numberOfWheels,
                                  double fuelConsumption, String carBodyType, int numberOfPassengers) {
        super(enginePower, fullSpeed, weight, brand, model, numberOfWheels, fuelConsumption);
        this.carBodyType = carBodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void display() {

        System.out.printf(this.getClass().getName() +
                        "\nEngine power: %s (horse power), %s (kilowatts)\tFull speed: %s (km/h)\t" +
                        "Weight: %s (kg)\tBrand: %s\tModel: %s\t" +
                        "Number of wheels: %s\tFuel consumption: %s (L/100km)\t" +
                        "Car body type: %s\tNumber of passengers: %s\n",
                super.getEnginePower(), getEnginePowerInKilowatts(super.getEnginePower()),
                super.getFullSpeed(), super.getWeight(), super.getBrand(), super.getModel(),
                super.getNumberOfWheels(), super.getFuelConsumption(), this.getCarBodyType(),
                this.getNumberOfPassengers());
    }

    public void countDistanceAndFuelConsumption(double time) {
        double distance = super.getFullSpeed() * time;
        System.out.println("За время " + time + " ч, автомобиль " +
                super.getBrand() + " двигаясь с максимальной скоростью " +
                super.getFullSpeed() + "км/ч проедет " + distance +
                " км и израсходует " + countFuelConsumption(distance) + " литров топлива.");
    }

    private double countFuelConsumption(double distance) {
        return super.getFuelConsumption() * distance / 100;
    }
}