package lesson4.application;

import lesson4.transportClasses.CargoLandTransport;
import lesson4.transportClasses.CivilAirTransport;
import lesson4.transportClasses.MilitaryAirTransport;
import lesson4.transportClasses.PassengerLandTransport;

public class Main {
    public static void main(String[] args) {
        CargoLandTransport truckMan = new CargoLandTransport(240, 110, 26000,
                "Man", "MAN TGM", 4, 22, 10);
        truckMan.display();
        System.out.println("trying to load 8 tons...");
        truckMan.possibilityToLoad(8);
        System.out.println("trying to load 15 tons...");
        truckMan.possibilityToLoad(15);
        System.out.println("----------------------------------------------------------");

        PassengerLandTransport carMitsubishi = new PassengerLandTransport(167, 198, 2210,
                "Mitsubishi", "Outlander", 4, 6.2,
                "SUV", 5);
        carMitsubishi.display();
        carMitsubishi.countDistanceAndFuelConsumption(2.5);
        System.out.println("----------------------------------------------------------");

        CivilAirTransport planeBoeing = new CivilAirTransport(25000, 988, 178800,
                "Boeing", "747-400", 64.4, 3018,
                524, true);
        planeBoeing.display();
        System.out.println("trying to place 500 passengers...");
        planeBoeing.possibilityToLoad(500);
        System.out.println("trying to place 650 passengers...");
        planeBoeing.possibilityToLoad(650);
        System.out.println("----------------------------------------------------------");

        MilitaryAirTransport helicopterAlligator = new MilitaryAirTransport(4800, 350, 10800,
                "Kamov", "Ka-52 'Alligator'", 7.3, 0,
                false, 6);
        helicopterAlligator.display();
        for (int i = 0; i < 7; i++) {
            helicopterAlligator.makeShot();
        }
        System.out.println("trying to do ejection...");
        helicopterAlligator.doEjection();
    }
}