package kalah;

/**
 * Invoker Class for Command design pattern.
 * @author mpie374
 */
public class GameActionInvoker {
    Command _command;

    /**
     * Sets command to be invoked
     * @param command - specific command
     */
    public void setCommand(Command command) {
        _command = command;
    }

    /**
     * Executes the command
     */
    public void executeCommand() {
        _command.execute();
    }
}
