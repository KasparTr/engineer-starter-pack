package pattern.structural.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new CarBase());  // Just a sports car
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new CarBase())); // A sports car with luxury features.
        sportsLuxuryCar.assemble();
    }
}
