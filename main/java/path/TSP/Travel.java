package path.TSP;


import java.util.ArrayList;
import java.util.Collections;

/**
 * Used for modeling a traveling salesman tour
 **/
public class Travel {

    private ArrayList<City> travel = new ArrayList<>();         // stores the order of travel
    private ArrayList<City> previousTravel = new ArrayList<>();

    public Travel(int numberOfCities) {
        for (int i = 0; i < numberOfCities; i++) {
            travel.add(new City());
        }
    }

    public void generateInitialRandomTravel() {
        if (travel.isEmpty())
            new Travel(10);
        Collections.shuffle(travel);
    }

    public void swapRandomCities() {
        int a = generateRandomIndex();
        int b = generateRandomIndex();
        previousTravel = travel;
        City cityA = travel.get(a);
        City cityB = travel.get(b);
        travel.set(a, cityB);
        travel.set(b, cityA);
    }

    public void revertSwap() {
        travel = previousTravel;
    }

    private int generateRandomIndex() {
        return (int) (Math.random() * travel.size());
    }

    public City getCity(int index) {
        return travel.get(index);
    }

    /**
     * Return the distance of the entire travel for all nodes in the system.
     * Loops the city array 'travel' that represents the order of which the cities are visited and gets the distances from start to destination until the hamilton circle is complete.
     **/
    public int getDistance() {
        int distance = 0;
        for (int index = 0; index < travel.size(); index++) {
            City starting = getCity(index);
            City destination;
            int destCityIndex;
            if (index + 1 < travel.size()) destCityIndex = index + 1;   // if there is next city in array, destination is next, otherwise go to beginning (i.e start)
            else destCityIndex = 0;

            destination = getCity(destCityIndex);
            distance += starting.distanceToCity(destination);

        }

        return distance;
    }

}