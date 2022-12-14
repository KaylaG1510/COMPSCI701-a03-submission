package kalah;

/**
 * House object that extends Pit.
 * @author mpie374
 */
public class House extends Pit {
    //Sets numSeeds to 4 on initiation
    House() { _numSeeds = 4; }

    /**
     * @return String representation of House
     */
    @Override
    public String toString() {
        return "[" + (_numSeeds < 10 ? " " + _numSeeds : _numSeeds) + "]";
    }
}
