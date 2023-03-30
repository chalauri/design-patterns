package ge.edu.sangu.command.implementations;

import ge.edu.sangu.command.interfaces.Command;
import ge.edu.sangu.command.interfaces.FileSystemReceiver;

public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}
