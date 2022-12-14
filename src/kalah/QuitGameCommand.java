package kalah;

import com.qualitascorpus.testsupport.IO;

/**
 * This Command executes the QuitGame Command, ending the current game
 * @author mpie374
 */
public class QuitGameCommand implements Command {
    private GameHandler _gameHandler;
    private IO _io;

    public QuitGameCommand(GameHandler gameHandler, IO io) {
        _gameHandler = gameHandler;
        _io = io;
    }

    @Override
    public void execute() {
        _gameHandler.userHasQuit(_io);
    }
}
