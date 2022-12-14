package kalah;

import com.qualitascorpus.testsupport.IO;

import java.util.ArrayList;

/**
 * Memento Class
 *The Board class holds the state of the board at any given time,
 * with the displayBoard method which acts as a toString to display
 * the board in a formatted way to the user.
 *
 * @author mpie374
 */
public class Board {
    private ArrayList<Pit> _playingBoardState;
    private boolean _isP1Turn;
    private final int NUMHOUSES = 6;
    private final int P1STOREINDEX = 6;
    private final int P2STOREINDEX = 13;

    /**
     * Constructor
     * @param currentBoardState, PlayerPits that comprise the current state of the board
     * @param isP1turn
     */
    Board(ArrayList<Pit> currentBoardState, boolean isP1turn) {
        _playingBoardState = new ArrayList<>(currentBoardState);
        _isP1Turn = isP1turn;
    }

    /**
     * Constructor
     * @param currentBoardState, PlayerPits that comprise the current state of the board
     */
    Board(ArrayList<Pit> currentBoardState) {
        _playingBoardState = new ArrayList<>(currentBoardState);
    }

    /**
     * @return TRUE if P1 turn, FALSE for p2
     */
    public boolean getIsP1Turn() { return _isP1Turn; }

    /**
     *
     * @param i - index of the Pit
     * @return - the Pit at the stated index
     */
    public Pit getPit(int i) {
        return _playingBoardState.get(i);
    }

    /**
     * Formats Board display to the user
     * @param io
     */
    public void displayBoard(IO io) {
        String boardEdge = "+----+-------+-------+-------+-------+-------+-------+----+";
        io.println(boardEdge);
        io.print("| P2 |");
        for(int i = 0; i < NUMHOUSES; i++) {
            io.print(" " + (NUMHOUSES - i) +  _playingBoardState.get(_playingBoardState.size() - i - 2).toString() + " |");
        }
        io.print(" " + _playingBoardState.get(P1STOREINDEX).toString() + " |");
        io.println("");
        io.println("|    |-------+-------+-------+-------+-------+-------|    |");
        io.print("| " + _playingBoardState.get(P2STOREINDEX).toString() + " |");
        for(int i = 0; i < NUMHOUSES; i++) {
            io.print(" " + (i + 1) + _playingBoardState.get(i).toString() + " |");
        }
        io.print(" P1 |");
        io.println("");
        io.print(boardEdge);
        io.println("");
    }

    /**
     * @return the index of P1 Store in ArrayList
     */
    public int getP1STOREINDEX() {
        return P1STOREINDEX;
    }

    /**
     * @return the index of P2 Store in ArrayList
     */
    public int getP2STOREINDEX() {
        return P2STOREINDEX;
    }
}
