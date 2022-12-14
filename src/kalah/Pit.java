package kalah;

/**
 * Abstract class that describes the Pit functionality (can be a
 * House or a Store). Each Pit has some number of seeds which can be
 * manipulated.
 * @author mpie374
 */
public abstract class Pit {
    protected int _numSeeds;

    //Adds specified # of seeds to the Pit
    protected void addSeeds(int seeds) {_numSeeds += seeds; }

    //Retrieves # seeds in Pit
    protected int getNumSeeds() { return _numSeeds; }

    //Empties the Pit (i.e. at start of turn)
    protected void emptyPit() { _numSeeds = 0; }

    //Clones the Pit when a copy of the Board is needed
    protected void clonePit(int clonedSeeds) { _numSeeds = clonedSeeds; }

    //Returns # seeds captured and empties the pit
    protected int captureSeeds() {
        int seeds = _numSeeds;
        emptyPit();
        return seeds;
    }

    //Returns String representation of Pit
    public String toString() {
        if(_numSeeds < 10)
            return " " + _numSeeds;
        else return String.valueOf(_numSeeds);
    }
}
