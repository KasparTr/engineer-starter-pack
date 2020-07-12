package path.AStar;

public class Cell {
    int heuristicCost = 0; // distance from End
    int finalCost = 0; //G+H
    int i, j;
    Cell parent;

    Cell(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "[" + this.i + ", " + this.j + "]";
    }
}