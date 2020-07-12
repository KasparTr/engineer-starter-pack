package pattern.structural.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());  // Just a sports car
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar())); // A sports acr, but also has Luxury carfeatures.
        sportsLuxuryCar.assemble();
    }
}
