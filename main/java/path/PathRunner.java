package path;

import path.TSP.SimulatedAnnealing;

public class PathRunner {
    public static void main(String[] args) {

        SimulatedAnnealing s = new SimulatedAnnealing(48);
        s.simulate(1200, 40000, 0.95);


    }
}
