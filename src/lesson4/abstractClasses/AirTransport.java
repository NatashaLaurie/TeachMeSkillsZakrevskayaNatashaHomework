package lesson4.abstractClasses;

public abstract class AirTransport extends Transport {
    double wingspan;
    int minRunwayLength;

    public AirTransport() {
        this.wingspan = 0;
        this.minRunwayLength = 0;
    }

    public AirTransport(int enginePower, int fullSpeed, int weight,
                        String brand, String model, double wingspan,
                        int minRunwayLength) {
        super(enginePower, fullSpeed, weight, brand, model);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public double getWingspan() {
        return wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }
}