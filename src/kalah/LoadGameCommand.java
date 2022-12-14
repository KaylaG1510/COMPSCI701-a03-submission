package kalah;

import com.qualitascorpus.testsupport.IO;

/**
 * This Command executes the 'loadGame' command, which replaces
 * the current Board state with the most recently saved
 * @author mpie374
 */
public class LoadGameCommand implements Command {
    private GameHandler _gameHandler;
    private IO _io;

    /**
     * Initiates a new Command as its own Object
     * @param gameHandler
     * @param io
     */
    public LoadGameCommand(GameHandler gameHandler, IO io) {
        _gameHandler = gameHandler;
        _io = io;
    }

    //execute the command
    @Override
    public void execute() {
        _gameHandler.loadGame(_io);
    }
}
