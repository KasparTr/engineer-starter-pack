package path.TSP;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Simulated annealing is a metaheuristical approach to optimization problems- problems with many different solutions, some better than others.
 * SA is a tradeoff approach between exploitation (always go higher, never lower- dangler of reaching local optimal, not global) and
 * exploration (taking a probabilistic chance of exploring worse routes in the hope of finding global optimal)

 Please note the few tips on how to choose the best simulation parameters:

 for small solution spaces it’s better to lower the starting temperature and increase the cooling rate, as it will reduce the simulation time, without lose of quality
 for bigger solution spaces please choose the higher starting temperature and small cooling rate, as there will be more local minimas
 always provide enough time to simulate from the high to low temperature of the system

 VISUAL DEMO: https://csvisualized.eschirtz.com/#/demos/ep01
 **/
public class SimulatedAnnealing {

        private Travel travel;

        public SimulatedAnnealing(int nrOfCities){
            travel = new Travel(nrOfCities);
        }

        public double simulate(double startingTemperature, int numberOfIterations, double coolingRate) {
            System.out.println("Starting SA with a temperature of " + startingTemperature + ", " + numberOfIterations + " iterations and cooling rate of " + coolingRate);
            double temp = startingTemperature;
            travel.generateInitialRandomTravel();
            double bestDistance = travel.getDistance();
            System.out.println("Initial (random) distance of travel: " + bestDistance);
            Travel bestTravel = travel;
            Travel currentTravel = bestTravel;

            // in each iteration, we swap random cities and check if
            // distance improved- new best, or
            // distance worsened - revert the swap, but only if the Boltzmann function of probability distribution is lower than randomly selected value between 0 to 1
            // note: more on Boltzmann distribution: https://www.youtube.com/watch?v=xQ9D4Jz95-A
            for (int i = 0; i < numberOfIterations; i++) {
                if (temp > 0.1) {
                    currentTravel.swapRandomCities();
                    double currentDistance = currentTravel.getDistance();
                    if (currentDistance < bestDistance) {
                        // distance improved, new best
                        bestDistance = currentDistance;
                    } else if (Math.exp((bestDistance - currentDistance) / temp) < Math.random()) {    // distance worsened
                        // Boltzmann function of probability distribution is lower than randomly picked value in a range from 0-1.
                        currentTravel.revertSwap();
                    }

                    temp *= coolingRate;    // lower the cooling rate
                    //System.out.println("Temperature: " + temp);
                    //System.out.println("Curr distance: " + bestDistance);

                } else {
                    // if temperature goes too low, avoid iterations
                    continue;
                }
            }
            System.out.println("Best distance of travel: " + bestDistance);
            return bestDistance;
        }

}
