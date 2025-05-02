package Lab10.task5;

public class Main {
    public static void main(String[] args) {
        WasherDryer washerDryer = new WasherDryer("LG");

        washerDryer.turnOn();
        washerDryer.wash();
        washerDryer.dry();

        Appliance appliance = new WasherDryer("Samsung");
        Appliance washable = new WasherDryer("Bosch");
        Appliance dryable = new WasherDryer("Whirlpool");

        appliance.turnOn();
        ((WasherDryer) washable).wash();
        ((WasherDryer) dryable).dry();
    }
}
