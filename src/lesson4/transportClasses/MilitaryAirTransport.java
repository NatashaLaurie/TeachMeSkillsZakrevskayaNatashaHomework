package lesson4.transportClasses;

import lesson4.abstractClasses.AirTransport;

public class MilitaryAirTransport extends AirTransport {
    boolean ejectionSystemAvailability;
    int numberOfMissiles;

    public MilitaryAirTransport() {
        this.ejectionSystemAvailability = false;
        this.numberOfMissiles = 0;
    }

    public MilitaryAirTransport(int enginePower, int fullSpeed, int weight,
                                String brand, String model, double wingspan,
                                int minRunwayLength, boolean ejectionSystemAvailability, int numberOfMissiles) {
        super(enginePower, fullSpeed, weight, brand, model, wingspan, minRunwayLength);
        this.ejectionSystemAvailability = ejectionSystemAvailability;
        this.numberOfMissiles = numberOfMissiles;
    }

    public boolean isEjectionSystemAvailability() {
        return ejectionSystemAvailability;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void display() {
        System.out.printf(this.getClass().getName() +
                        "\nEngine power: %s (horse power), %s (kilowatts)\tFull speed: %s (km/h)\t" +
                        "Weight: %s (kg)\tBrand: %sModel: %s\t" +
                        "Wingspan: %s (meters)\tMinimum runway length for take-off: %s (meters)\t" +
                        "Ejection system: %s \tNumber of missiles: %s\n",
                super.getEnginePower(), getEnginePowerInKilowatts(super.getEnginePower()),
                super.getFullSpeed(), super.getWeight(), super.getBrand(), super.getModel(),
                super.getWingspan(), super.getMinRunwayLength(),
                this.isEjectionSystemAvailability() ? "available" : "not available",
                this.getNumberOfMissiles());
    }

    public void makeShot() {
        if (this.getNumberOfMissiles() > 0) {
            System.out.print("\nMissile fired!!!");
            this.numberOfMissiles--;
        } else System.out.println("\nNo ammunition");
    }

    public void doEjection() {
        if (this.isEjectionSystemAvailability()) {
            System.out.println("\n" + "Successful ejection done!!!");
            this.ejectionSystemAvailability = false;
        } else System.out.println("You don't have such a system((((");
    }
}