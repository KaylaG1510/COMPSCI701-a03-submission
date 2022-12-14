package kalah;

import java.util.ArrayList;
import java.util.List;

/**
 * Memento: Caretaker class
 *
 * Saves List of recently saved Board's but only most recently saved one is accessible
 * (future-proofing)
 * @author mpie374
 */
public class SavedBoardStates {
    private List<Board> _savedBoardList;

    /**
     * Default Constructor
     */
    SavedBoardStates() {
        _savedBoardList = new ArrayList<>();
    }

    /**
     * Adds a new saved Board
     * @param newBoardSaveState - new Board to be saved
     */
    public void addSavedBoardState(Board newBoardSaveState) {
        _savedBoardList.add(newBoardSaveState);
    }

    /**
     * @returns the most recently saved Board in List
     */
    public Board getRecentlySavedBoard() {
        if(_savedBoardList.size() != 0)
            return _savedBoardList.get(_savedBoardList.size() -1);
        else
            return null;
    }
}
