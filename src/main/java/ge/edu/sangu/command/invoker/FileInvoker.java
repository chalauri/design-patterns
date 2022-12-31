package ge.edu.sangu.command.invoker;

import ge.edu.sangu.command.interfaces.Command;

public class FileInvoker {

    public Command command;

    public FileInvoker(Command c) {
        this.command = c;
    }

    public void execute() {
        this.command.execute();
    }
}
