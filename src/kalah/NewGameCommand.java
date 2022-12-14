package kalah;

import com.qualitascorpus.testsupport.IO;

/**
 * This Command objectifies the NewGame Command call and can execute the command
 * @author mpie374
 */
public class NewGameCommand implements Command {
    private GameHandler _gameHandler;
    private IO _io;

    //Creates NewGameCommand as own object
    public NewGameCommand(GameHandler gameHandler, IO io) {
        _gameHandler = gameHandler;
        _io = io;
    }

    //Executes the command
    @Override
    public void execute() {
        _gameHandler.newGame(_io);
    }
}
