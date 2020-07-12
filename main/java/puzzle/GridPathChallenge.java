package puzzle;

public class GridPathChallenge {

    private int[][] grid;

    public int[][] getGrid() {
        return grid;
    }

    /**
     * Specify grid size in the constructor.
     * Grid is made up of numbers between 0 - 3
     * 0 means the path is free to move
     * 1 means the path is blocked
     * 2 means a start position
     * 3 means a end position
     *
     * Challenge is to find the number of paths from start (2) to end (3).
     * Use bottom-up recursive solution.
     * Rules: Movement can be done to down or right
     * @param gridSize
     */
    public GridPathChallenge(int gridSize, boolean easyGrid){
        this.grid = new int[gridSize][gridSize];

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                if(i == 0 && j == 0) this.grid[i][j] = 2;
                else if(i == gridSize-1 && j == gridSize-1) this.grid[i][j] = 3;
                else this.grid[i][j] = randomZeroOrOne(easyGrid);
            }
        }
    }

    /**
     * Bottom-up recursive solution.
     *  1. What is end criteria (grid value 3)
     *  2. What is the stop criteria (yes, grid value 1)
     *  3. What are the rules (move down or right, end is in bottom right)
     *  4. Generalized values (already done)
     *
     * If a non-valid cell is reached, that path has 0 routes to the end, return 0
     * If an end was reached, that path was one route, return 1
     * If both above are not true, we do the same algorithm again from that position and add up until the end.
     * @return
     */
    public int findNumberOfPaths(int i, int j){


        if(!validCell(i, j)) return 0;  // stop criteria
        if(endCell(i, j)) return 1;     // end criteria

        return
                findNumberOfPaths(i+1, j) +
                        findNumberOfPaths(i, j+1);
    }

    private boolean validCell(int i, int j){
        if(i > grid[0].length - 1) return false;
        if(j > grid[0].length - 1) return false;
        if(this.grid[i][j] == 1) return false;
        return true;
    }

    private boolean endCell(int i, int j){
        return this.grid[i][j] == 3;
    }


    private static int randomZeroOrOne(boolean zeroProne){
        double check;
        if(zeroProne) check = 0.55;
        else check = 0.45;
        if(Math.random() < check) return 0;
        else return 1;
    }
}
