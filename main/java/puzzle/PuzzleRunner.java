package puzzle;

public class PuzzleRunner {

    public static void main(String[] args) {
        GridPathChallenge challenge = new GridPathChallenge(6, true);
        System.out.println("Grid created");
        printGrid(challenge.getGrid());
        System.out.println("");

        int nrOfPaths = challenge.findNumberOfPaths(0,0);
        System.out.println("Number of paths through grid: " + nrOfPaths);
    }

    private static void printGrid(int[][] grid){
        for (int i = 0; i < grid.length; i++) {
            System.out.println("");
            for (int j = 0; j < grid.length; j++) {
                System.out.print(" " + grid[i][j]);
            }
        }
    }
}
