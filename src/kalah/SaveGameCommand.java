package kalah;

import com.qualitascorpus.testsupport.IO;

/**
 * This Command executes the SaveGameCommand, saving the current Board state
 * so that it can be loaded by either Player later on
 * @author mpie374
 */
public class SaveGameCommand implements Command {
    private GameHandler _gameHandler;
    private IO _io;

    public SaveGameCommand(GameHandler gameHandler, IO io) {
        _gameHandler = gameHandler;
        _io = io;
    }

    @Override
    public void execute() {
        _gameHandler.saveGame(_io);
    }
}
