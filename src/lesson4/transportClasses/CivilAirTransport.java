package lesson4.transportClasses;

import lesson4.abstractClasses.AirTransport;

public class CivilAirTransport extends AirTransport {
    int maxNumberOfPassengers;
    boolean businessClassAvailability;

    public CivilAirTransport() {
        this.maxNumberOfPassengers = 0;
        this.businessClassAvailability = false;
    }

    public CivilAirTransport(int enginePower, int fullSpeed, int weight,
                             String brand, String model, double wingspan,
                             int minRunwayLength, int maxNumberOfPassengers,
                             boolean businessClassAvailability) {
        super(enginePower, fullSpeed, weight, brand, model, wingspan, minRunwayLength);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public boolean isBusinessClassAvailability() {
        return businessClassAvailability;
    }

    public void display() {

        System.out.printf(this.getClass().getName() +
                        "\nEngine power: %s (horse power), %s (kilowatts)\tFull speed: %s (km/h)\t" +
                        "Weight: %s (kg)\tBrand: %s\tModel: %s\t" +
                        "Wingspan: %s (meters)\tMinimum runway length for take-off: %s (meters)\t" +
                        "Number of passengers: %s \tBusiness Class: %s\n",
                super.getEnginePower(), getEnginePowerInKilowatts(super.getEnginePower()),
                super.getFullSpeed(), super.getWeight(), super.getBrand(), super.getModel(),
                super.getWingspan(), super.getMinRunwayLength(), this.getMaxNumberOfPassengers(),
                this.isBusinessClassAvailability() ? "available" : "not available");
    }

    public void possibilityToLoad(int numberOfPassengers) {
        if (numberOfPassengers > this.getMaxNumberOfPassengers()) {
            System.out.println("You need a bigger plane!!!");
        } else System.out.println("Plane loaded");
    }
}