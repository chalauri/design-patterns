package ge.edu.sangu.command.implementations;

import ge.edu.sangu.command.interfaces.Command;
import ge.edu.sangu.command.interfaces.FileSystemReceiver;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }

}
