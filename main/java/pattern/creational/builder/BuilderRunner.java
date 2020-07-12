package pattern.creational.builder;

/**
 * Source: https://www.journaldev.com/1425/builder-design-pattern-in-java
 */
public class BuilderRunner {

    public static void main(String[] args) {

        Computer computer = new Computer.ComputerBuilder(
                "500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }
}
