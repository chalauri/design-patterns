package ge.edu.sangu.command;

import ge.edu.sangu.command.implementations.CloseFileCommand;
import ge.edu.sangu.command.implementations.OpenFileCommand;
import ge.edu.sangu.command.implementations.WriteFileCommand;
import ge.edu.sangu.command.interfaces.FileSystemReceiver;
import ge.edu.sangu.command.invoker.FileInvoker;
import ge.edu.sangu.command.util.FileSystemReceiverUtil;

public class FileSystemClient {

    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);

        //perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
