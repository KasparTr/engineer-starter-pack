package pattern.structural.decorator;

/**
 * Component Implementation – The basic implementation of the component interface. We can have BasicCar class as our component implementation.
 * Base is required by all cars, no matter what type of car we are dealing with. This class represents the chassy, wireing, etc...
 */
public class CarBase implements Car {

    @Override
    public void assemble() {
        System.out.print("Assembling the base of a Car.");
    }

}