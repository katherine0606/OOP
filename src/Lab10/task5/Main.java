package Lab10.task5;

public class Main {
    public static void main(String[] args) {
        WasherDryer washerDryer = new WasherDryer("LG");

        washerDryer.turnOn();
        washerDryer.wash();
        washerDryer.dry();

        Appliance appliance = new WasherDryer("Samsung");
        Washable washable = new WasherDryer("Bosch");
        Dryable dryable = new WasherDryer("Whirlpool");

        appliance.turnOn();
        washable.wash();
        dryable.dry();
    }
}
